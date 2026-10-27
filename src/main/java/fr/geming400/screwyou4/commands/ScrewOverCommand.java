package fr.geming400.screwyou4.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import fr.geming400.screwyou4.entrypoints.ScrewYou4;
import fr.geming400.screwyou4.killer.AssignedSentence;
import fr.geming400.screwyou4.killer.ClassExecutioner;
import fr.geming400.screwyou4.killer.Sentence;
import fr.geming400.screwyou4.killer.parser.ClassRepresentation;
import fr.geming400.screwyou4.killer.parser.Infos;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.ClientCommands;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.fabricmc.fabric.api.command.v2.ArgumentTypeRegistry;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.synchronization.SingletonArgumentInfo;
import net.minecraft.network.chat.Component;
import net.minecraft.server.permissions.Permissions;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Util;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

public class ScrewOverCommand {
    private static final String HELP_TEXT = """
            /screw help
            /screw kill <nb of classes to target>
            /screw kill class name.of.the.class#nameOfTheMethod=return_override
            /screw kill package name.of.the.package.*  -> Only the given package
            /screw kill package name.of.the.package.** -> Recursive
            /screw kill package name.of.the.package.*  all -> Kills ALL the functions of the given package
            /screw kill package name.of.the.package.** all -> Kills ALL the functions of the given package and its children
            """;

    private static Component getHelpText(boolean isClientCommand) {
        if (isClientCommand)
            return Component.literal(HELP_TEXT.replace("/screw", "/screw-client"));

        return Component.literal(HELP_TEXT);
    }

    public static void initialize() {
        registerArguments();

        CommandRegistrationCallback.EVENT.register(
                (dispatcher, _, _) -> {
                    LiteralArgumentBuilder<CommandSourceStack> builder = Commands.literal("screw")
                            .requires(source -> source.permissions().hasPermission(Permissions.COMMANDS_MODERATOR));
                    registerServerKillCommand(builder);
                    dispatcher.register(builder);
                }
        );

        ClientCommandRegistrationCallback.EVENT.register((dispatcher, _) -> {
            LiteralArgumentBuilder<FabricClientCommandSource> builder = ClientCommands.literal("screw-client");
            registerClientKillCommand(builder);

            dispatcher.register(builder);
        });
    }

    private static void registerArguments() {
        ArgumentTypeRegistry.registerArgumentType(
                ScrewYou4.id("sentence"),
                SentenceArgumentType.class,
                SingletonArgumentInfo.contextFree(SentenceArgumentType::new)
        );

        ArgumentTypeRegistry.registerArgumentType(
                ScrewYou4.id("package"),
                PackageArgumentType.class,
                SingletonArgumentInfo.contextFree(PackageArgumentType::new)
        );
    }

    public static void registerServerKillCommand(LiteralArgumentBuilder<CommandSourceStack> builder) {
        builder.then(
                Commands.literal("kill")
                        .then(Commands.argument("count", IntegerArgumentType.integer(0))
                                .executes(ScrewOverCommand::serverKillRandomMethods))
                        .then(Commands.literal("class")
                                .then(Commands.argument("class_name", SentenceArgumentType.sentence())
                                        .executes(ScrewOverCommand::serverKillSpecificClass))
                        )
                        .then(Commands.literal("package")
                                .then(Commands.argument("package", PackageArgumentType.pkg())
                                        .executes(context -> serverKillSpecificPackage(context, 1))
                                        .then(Commands.literal("all")
                                                .executes(context -> serverKillSpecificPackage(context, -1))
                                        )
                                        .then(Commands.literal("count")
                                                .then(Commands.argument("count", IntegerArgumentType.integer(0))
                                                        .executes(context -> serverKillSpecificPackage(context, IntegerArgumentType.getInteger(context, "count")))
                                                )
                                        )
                                )
                        )
        ).then(Commands.literal("help").executes(context -> {
            context.getSource().sendSuccess(() -> getHelpText(false), false);
            return Command.SINGLE_SUCCESS;
        }));
    }

    public static void registerClientKillCommand(LiteralArgumentBuilder<FabricClientCommandSource> builder) {
        builder.then(
                ClientCommands.literal("kill")
                        .then(ClientCommands.argument("count", IntegerArgumentType.integer(0))
                                .executes(ScrewOverCommand::clientKillRandomFunctions))
                        .then(ClientCommands.literal("class")
                                .then(ClientCommands.argument("class_name", SentenceArgumentType.sentence()).executes(ScrewOverCommand::clientKillSpecificClass))
                        )
                        .then(ClientCommands.literal("package")
                                .then(ClientCommands.argument("package", PackageArgumentType.pkg())
                                        .executes(context -> clientKillSpecificPackage(context, 1))
                                        .then(ClientCommands.literal("all")
                                                .executes(context -> clientKillSpecificPackage(context, -1))
                                        )
                                        .then(ClientCommands.literal("count")
                                                .then(ClientCommands.argument("count", IntegerArgumentType.integer(0))
                                                        .executes(context -> clientKillSpecificPackage(context, IntegerArgumentType.getInteger(context, "count")))
                                                )
                                        )
                                )
                        )
        ).then(ClientCommands.literal("help").executes(context -> {
            context.getSource().sendFeedback(getHelpText(true));
            return Command.SINGLE_SUCCESS;
        }));
    }


    private static int killRandomFunctions(int n, RandomSource random) {
        // Peek optimization
        Thread.ofVirtual().start(() -> {
            for (int i = 0; i < n; i++) {
                ClassExecutioner.kill(Sentence.ofIterating(random));
            }
        });
        return Command.SINGLE_SUCCESS;
    }

    private static int serverKillRandomMethods(CommandContext<CommandSourceStack> context) {
        int n = IntegerArgumentType.getInteger(context, "count");
        RandomSource random = Objects.requireNonNull(context.getSource().getPlayer()).getRandom();

        return killRandomFunctions(n, random);
    }



    private static int clientKillRandomFunctions(CommandContext<FabricClientCommandSource> context) {
        int n = IntegerArgumentType.getInteger(context, "count");
        RandomSource random = Objects.requireNonNull(context.getSource().getPlayer()).getRandom();

        return killRandomFunctions(n, random);
    }

    private static int killSpecificClass(AssignedSentence sentence, RandomSource random, Consumer<Component> onFailure) {
        if (sentence.all()) {
            for (Infos.MethodInfo info : sentence.representation().getMethodInfos()) {
                ClassExecutioner.tryRetransform(
                        new Sentence(random, false, Optional.of(info),
                                Optional.of(sentence.representation()), Optional.empty(),
                                Optional.empty()),
                        sentence.clazz(),
                        callbackFromClass(sentence.clazz(), onFailure)
                );
            }
        } else {
            ClassExecutioner.tryRetransform(
                    sentence.getSentence(random),
                    sentence.clazz(),
                    callbackFromClass(sentence.clazz(), onFailure)
            );
        }

        return Command.SINGLE_SUCCESS;
    }

    private static int killSpecificClass(CommandContext<?> context, RandomSource random, Consumer<Component> onFailure) {
        AssignedSentence assignedSentence = SentenceArgumentType.getSentence(context, "class_name");
        return killSpecificClass(assignedSentence, random, onFailure);
    }

    private static int serverKillSpecificClass(CommandContext<CommandSourceStack> context) {
        RandomSource random = Objects.requireNonNull(context.getSource().getPlayer()).getRandom().fork();
        return killSpecificClass(context, random, message -> context.getSource().sendFailure(message));
    }

    private static int clientKillSpecificClass(CommandContext<FabricClientCommandSource> context) {
        RandomSource random = Objects.requireNonNull(context.getSource().getPlayer()).getRandom().fork();
        return killSpecificClass(context, random, message -> context.getSource().sendError(message));
    }

    @SuppressWarnings("SameReturnValue")
    private static int killSpecificPackage(CommandContext<?> context, RandomSource random, Consumer<Component> onFailure, int count) {
        List<Class<?>> packageClasses = PackageArgumentType.getPackageClasses(context, "package");
        if (packageClasses.isEmpty()) {
            onFailure.accept(Component.literal("Package is empty!"));
            return Command.SINGLE_SUCCESS;
        }
        if (count == -1) {
            packageClasses.forEach(clazz -> Thread.ofVirtual().start(() -> {
                ClassRepresentation classRepresentation = ClassExecutioner.getRepresentation(clazz);
                if (classRepresentation == null) {
                    return;
                }
                classRepresentation.getMethodInfos().forEach(methodInfo -> ClassExecutioner.tryRetransform(
                        new Sentence(
                                random,
                                false,
                                Optional.of(methodInfo),
                                Optional.of(classRepresentation),
                                Optional.empty(),
                                Optional.empty()
                        ),
                        clazz,
                        callbackFromClass(clazz, onFailure)
                ));
            }));
        } else {
            for (int i = 0; i < count; i++) {
                Class<?> chosenClazz = Util.getRandom(packageClasses, random);

                ClassExecutioner.tryRetransform(
                        Sentence.empty(random),
                        chosenClazz,
                        callbackFromClass(chosenClazz, onFailure)
                );
            }
        }

        return Command.SINGLE_SUCCESS;
    }

    private static int serverKillSpecificPackage(CommandContext<CommandSourceStack> context, int count) {
        RandomSource random = Objects.requireNonNull(context.getSource().getPlayer()).getRandom().fork();

        return killSpecificPackage(context, random, message -> context.getSource().sendFailure(message), count);
    }

    private static int clientKillSpecificPackage(CommandContext<FabricClientCommandSource> context, int count) {
        RandomSource random = Objects.requireNonNull(context.getSource().getPlayer()).getRandom().fork();

        return killSpecificPackage(context, random, message -> context.getSource().sendError(message), count);
    }

    private static Consumer<Exception> callbackFromClass(Class<?> clazz, Consumer<Component> onFailure) {
        return e -> onFailure.accept(Component.literal("Error while killing " + clazz.getSimpleName() + ", " + e.getClass().getSimpleName() + " : " + e.getMessage()));
    }
}
