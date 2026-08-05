package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ScoreboardSlotArgument.class)
public class ScoreboardSlotArgument1848785401Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1484921801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1484921801L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/world/scores/DisplaySlot;", cancellable = true)
    private void parse_552822887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552822887L))
            info.setReturnValue(net.minecraft.world.scores.DisplaySlot.TEAM_DARK_PURPLE);
    }

    @Inject(at = @At("HEAD"), method = "displaySlot()Lnet/minecraft/commands/arguments/ScoreboardSlotArgument;", cancellable = true)
    private static void displaySlot_1202594298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1202594298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1097227610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097227610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__721567896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721567896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisplaySlot(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/scores/DisplaySlot;", cancellable = true)
    private static void getDisplaySlot__486789490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-486789490L))
            info.setReturnValue(net.minecraft.world.scores.DisplaySlot.TEAM_DARK_BLUE);
    }


}
