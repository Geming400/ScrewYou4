package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.TeamColorArgument.class)
public class TeamColorArgument_1120220235Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_826838491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(826838491L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/world/scores/TeamColor;", cancellable = true)
    private void parse__2132625179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2132625179L))
            info.setReturnValue(net.minecraft.world.scores.TeamColor.WHITE);
    }

    @Inject(at = @At("HEAD"), method = "teamColor()Lnet/minecraft/commands/arguments/TeamColorArgument;", cancellable = true)
    private static void teamColor_1802481465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1802481465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTeamColor(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/scores/TeamColor;", cancellable = true)
    private static void getTeamColor_1546169443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1546169443L))
            info.setReturnValue(net.minecraft.world.scores.TeamColor.DARK_GREEN);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1361143676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1361143676L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__693428038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-693428038L))
            info.setReturnValue(null);
    }


}
