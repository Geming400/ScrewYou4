package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ObjectiveCriteriaArgument.class)
public class ObjectiveCriteriaArgument201827815Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Lnet/minecraft/stats/StatType;Ljava/lang/Object;)Ljava/lang/String;", cancellable = true)
    private void getName_1786262807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1786262807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__91553928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-91553928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;", cancellable = true)
    private void parse__301426768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301426768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "criteria()Lnet/minecraft/commands/arguments/ObjectiveCriteriaArgument;", cancellable = true)
    private static void criteria_1120241636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1120241636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_442751257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(442751257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1611820457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1611820457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCriteria(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;", cancellable = true)
    private static void getCriteria_830554850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830554850L))
            info.setReturnValue(null);
    }


}
