package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.GameProfileArgument.class)
public class GameProfileArgument1980702662Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1687320919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687320919L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void parse_126574011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(126574011L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/GameProfileArgument$Result;", cancellable = true)
    private void parse_1329598811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329598811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Lnet/minecraft/commands/arguments/GameProfileArgument$Result;", cancellable = true)
    private void parse_863622775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(863622775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameProfiles(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getGameProfiles__492299030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-492299030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_167054390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(167054390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions__2073341192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073341192L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "gameProfile()Lnet/minecraft/commands/arguments/GameProfileArgument;", cancellable = true)
    private static void gameProfile_1780944772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1780944772L))
            info.setReturnValue(null);
    }


}
