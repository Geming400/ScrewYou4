package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.Commands.class)
public class Commands_1308992638Mixin {
        @Inject(at = @At("HEAD"), method = "validate()V", cancellable = true)
    private static void validate_1347267624(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1347267624L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "argument(Ljava/lang/String;Lcom/mojang/brigadier/arguments/ArgumentType;)Lcom/mojang/brigadier/builder/RequiredArgumentBuilder;", cancellable = true)
    private static void argument__1003589235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1003589235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "literal(Ljava/lang/String;)Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;", cancellable = true)
    private static void literal_1598387303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1598387303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapSource(Lcom/mojang/brigadier/ParseResults;Ljava/util/function/UnaryOperator;)Lcom/mojang/brigadier/ParseResults;", cancellable = true)
    private static void mapSource_1123241835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1123241835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasPermission(Lnet/minecraft/server/permissions/PermissionCheck;)Lnet/minecraft/server/permissions/PermissionProviderCheck;", cancellable = true)
    private static void hasPermission__566773531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-566773531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParseException(Lcom/mojang/brigadier/ParseResults;)Lcom/mojang/brigadier/exceptions/CommandSyntaxException;", cancellable = true)
    private static void getParseException_257152693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(257152693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trimOptionalPrefix(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void trimOptionalPrefix__1773232588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1773232588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendCommands(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void sendCommands_539430784(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(539430784L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "validateParseResults(Lcom/mojang/brigadier/ParseResults;)V", cancellable = true)
    private static void validateParseResults__191749885(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-191749885L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createValidator(Lnet/minecraft/commands/Commands$ParseFunction;)Ljava/util/function/Predicate;", cancellable = true)
    private static void createValidator__781689842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-781689842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createValidationContext(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/commands/CommandBuildContext;", cancellable = true)
    private static void createValidationContext__988872978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-988872978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDispatcher()Lcom/mojang/brigadier/CommandDispatcher;", cancellable = true)
    private void getDispatcher_103943282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(103943282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performCommand(Lcom/mojang/brigadier/ParseResults;Ljava/lang/String;)V", cancellable = true)
    private void performCommand_1392925525(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1392925525L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)V", cancellable = true)
    private void performPrefixedCommand__2104515844(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2104515844L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "executeCommandInContext(Lnet/minecraft/commands/CommandSourceStack;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void executeCommandInContext__185911088(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-185911088L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCompilationContext(Lnet/minecraft/server/permissions/PermissionSet;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private static void createCompilationContext_1652623651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1652623651L))
            info.setReturnValue(null);
    }


}
