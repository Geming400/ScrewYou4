package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.GameModeArgument.class)
public class GameModeArgument1366567996Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1967139206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1967139206L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void parse__226380731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-226380731L))
            info.setReturnValue(net.minecraft.world.level.GameType.SURVIVAL);
    }

    @Inject(at = @At("HEAD"), method = "gameMode()Lnet/minecraft/commands/arguments/GameModeArgument;", cancellable = true)
    private static void gameMode__315418587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315418587L))
            info.setReturnValue(new net.minecraft.commands.arguments.GameModeArgument());
    }

    @Inject(at = @At("HEAD"), method = "getGameMode(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void getGameMode__1928081077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1928081077L))
            info.setReturnValue(net.minecraft.world.level.GameType.ADVENTURE);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_615010205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(615010205L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1203785301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203785301L))
            info.setReturnValue(null);
    }


}
