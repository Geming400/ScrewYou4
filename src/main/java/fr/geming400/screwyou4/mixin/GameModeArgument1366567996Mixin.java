package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.GameModeArgument.class)
public class GameModeArgument1366567996Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1073186253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1073186253L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void parse__1895213864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1895213864L))
            info.setReturnValue(net.minecraft.world.level.GameType.SURVIVAL);
    }

    @Inject(at = @At("HEAD"), method = "gameMode()Lnet/minecraft/commands/arguments/GameModeArgument;", cancellable = true)
    private static void gameMode__1250283398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250283398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameMode(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void getGameMode__99208746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-99208746L))
            info.setReturnValue(net.minecraft.world.level.GameType.ADVENTURE);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1607491438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1607491438L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__447080276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-447080276L))
            info.setReturnValue(null);
    }


}
