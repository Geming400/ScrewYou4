package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.TeamColorArgument.class)
public class TeamColorArgument_1120220235Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_2081480328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2081480328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/world/scores/TeamColor;", cancellable = true)
    private void parse__406785774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-406785774L))
            info.setReturnValue(net.minecraft.world.scores.TeamColor.DARK_AQUA);
    }

    @Inject(at = @At("HEAD"), method = "getTeamColor(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/scores/TeamColor;", cancellable = true)
    private static void getTeamColor__645372397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645372397L))
            info.setReturnValue(net.minecraft.world.scores.TeamColor.DARK_BLUE);
    }

    @Inject(at = @At("HEAD"), method = "teamColor()Lnet/minecraft/commands/arguments/TeamColorArgument;", cancellable = true)
    private static void teamColor_910742591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(910742591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_368662443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(368662443L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1450133063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450133063L))
            info.setReturnValue(null);
    }


}
