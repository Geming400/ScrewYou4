package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ObjectiveCriteriaArgument.class)
public class ObjectiveCriteriaArgument201827815Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Lnet/minecraft/stats/StatType;Ljava/lang/Object;)Ljava/lang/String;", cancellable = true)
    private void getName__812086440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-812086440L))
            info.setReturnValue("#Af},O-\u85D4o5Pt]$J\u3C8F @48@}\u73CC<%ccm@o\u7C08|/\u2DD6yd3kBEs$5Kl2[-,fsXuinE\uCF33E\u559F\u8DACD\u5E93wra:v");
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1163087909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1163087909L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;", cancellable = true)
    private void parse__704241885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-704241885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "criteria()Lnet/minecraft/commands/arguments/ObjectiveCriteriaArgument;", cancellable = true)
    private static void criteria_313847619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(313847619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_1926441814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1926441814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions__549729976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-549729976L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getCriteria(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;", cancellable = true)
    private static void getCriteria__1559325833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1559325833L))
            info.setReturnValue(null);
    }


}
