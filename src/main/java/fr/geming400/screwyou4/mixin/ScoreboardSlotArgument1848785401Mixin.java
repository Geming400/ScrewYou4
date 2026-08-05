package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ScoreboardSlotArgument.class)
public class ScoreboardSlotArgument1848785401Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1555403658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1555403658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/world/scores/DisplaySlot;", cancellable = true)
    private void parse__121469062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-121469062L))
            info.setReturnValue(net.minecraft.world.scores.DisplaySlot.TEAM_DARK_GREEN);
    }

    @Inject(at = @At("HEAD"), method = "getDisplaySlot(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/scores/DisplaySlot;", cancellable = true)
    private static void getDisplaySlot_441839992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(441839992L))
            info.setReturnValue(net.minecraft.world.scores.DisplaySlot.SIDEBAR);
    }

    @Inject(at = @At("HEAD"), method = "displaySlot()Lnet/minecraft/commands/arguments/ScoreboardSlotArgument;", cancellable = true)
    private static void displaySlot_1415879642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1415879642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_2089708843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2089708843L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_35137129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(35137129L))
            info.setReturnValue(null);
    }


}
