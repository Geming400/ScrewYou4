package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.Commands.class)
public class Commands_1308992638Mixin {
        @Inject(at = @At("HEAD"), method = "validate()V", cancellable = true)
    private static void validate_425119954(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(425119954L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "argument(Ljava/lang/String;Lcom/mojang/brigadier/arguments/ArgumentType;)Lcom/mojang/brigadier/builder/RequiredArgumentBuilder;", cancellable = true)
    private static void argument__1056551568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1056551568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "literal(Ljava/lang/String;)Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;", cancellable = true)
    private static void literal__605464488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-605464488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapSource(Lcom/mojang/brigadier/ParseResults;Ljava/util/function/UnaryOperator;)Lcom/mojang/brigadier/ParseResults;", cancellable = true)
    private static void mapSource__1082632830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1082632830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasPermission(Lnet/minecraft/server/permissions/PermissionCheck;)Lnet/minecraft/server/permissions/PermissionProviderCheck;", cancellable = true)
    private static void hasPermission__202402066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-202402066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)V", cancellable = true)
    private void performPrefixedCommand__236736907(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-236736907L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getParseException(Lcom/mojang/brigadier/ParseResults;)Lcom/mojang/brigadier/exceptions/CommandSyntaxException;", cancellable = true)
    private static void getParseException__1645645661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1645645661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trimOptionalPrefix(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void trimOptionalPrefix__1491568376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1491568376L))
            info.setReturnValue("IG\uC62Ci{I6re\u6C5AiD9y\u87FD&_o(|M0QbFVQ]<5?<>\uA379*N?#tr\u625DK%(uJol:\uC06DOVbDY3zS6\\");
    }

    @Inject(at = @At("HEAD"), method = "createValidator(Lnet/minecraft/commands/Commands$ParseFunction;)Ljava/util/function/Predicate;", cancellable = true)
    private static void createValidator_865241368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(865241368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performCommand(Lcom/mojang/brigadier/ParseResults;Ljava/lang/String;)V", cancellable = true)
    private void performCommand_260637567(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(260637567L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendCommands(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void sendCommands__52301392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-52301392L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDispatcher()Lcom/mojang/brigadier/CommandDispatcher;", cancellable = true)
    private void getDispatcher__783210609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-783210609L))
            info.setReturnValue(new com.mojang.brigadier.CommandDispatcher());
    }

    @Inject(at = @At("HEAD"), method = "validateParseResults(Lcom/mojang/brigadier/ParseResults;)V", cancellable = true)
    private static void validateParseResults_1399409148(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1399409148L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "executeCommandInContext(Lnet/minecraft/commands/CommandSourceStack;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void executeCommandInContext_325668348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(325668348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createValidationContext(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/commands/CommandBuildContext;", cancellable = true)
    private static void createValidationContext_1038271432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038271432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCompilationContext(Lnet/minecraft/server/permissions/PermissionSet;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private static void createCompilationContext_1348715419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1348715419L))
            info.setReturnValue(null);
    }


}
