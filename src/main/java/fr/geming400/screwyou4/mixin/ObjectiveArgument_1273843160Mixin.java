package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ObjectiveArgument.class)
public class ObjectiveArgument_1273843160Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/String;", cancellable = true)
    private void parse__759678397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-759678397L))
            info.setReturnValue("nJDs\u8B62\uFA38w`\uB0F4?\uBE0Fn:P)wKg[D?h`|./ghNEIPc'\u55D8yB\u81E4 h_\u0733a{lpYZyVa.@)HB\u8538O6}Nh\uA917\uB6B1whh\u55A2");
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__2059864043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059864043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "objective()Lnet/minecraft/commands/arguments/ObjectiveArgument;", cancellable = true)
    private static void objective_1047161580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1047161580L))
            info.setReturnValue(new net.minecraft.commands.arguments.ObjectiveArgument());
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_522285368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(522285368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1296510138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1296510138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getObjective(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/scores/Objective;", cancellable = true)
    private static void getObjective__1945712710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1945712710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWritableObjective(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/scores/Objective;", cancellable = true)
    private static void getWritableObjective__237708934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-237708934L))
            info.setReturnValue(null);
    }


}
