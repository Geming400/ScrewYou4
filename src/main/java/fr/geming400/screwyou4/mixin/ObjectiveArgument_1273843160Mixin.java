package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ObjectiveArgument.class)
public class ObjectiveArgument_1273843160Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/String;", cancellable = true)
    private void parse__2014320234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2014320234L))
            info.setReturnValue("=ac\uD689M0}5\u392Cc|x;`9\uFC67_\uC2C57\u58C7A\u5B6EK3&'nWx7^J\u3DFCq8w?\uC2DA\u01E4Tn\u3E73/F{");
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_980461416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(980461416L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "objective()Lnet/minecraft/commands/arguments/ObjectiveArgument;", cancellable = true)
    private static void objective_1488761011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1488761011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWritableObjective(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/scores/Objective;", cancellable = true)
    private static void getWritableObjective_1954474717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954474717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getObjective(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/scores/Objective;", cancellable = true)
    private static void getObjective_1954474717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954474717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1514766601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514766601L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__539805113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-539805113L))
            info.setReturnValue(null);
    }


}
