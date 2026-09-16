package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.GameProfileArgument.class)
public class GameProfileArgument1980702662Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1353004540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1353004540L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void parse_1795407144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795407144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/GameProfileArgument$Result;", cancellable = true)
    private void parse__1305938290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1305938290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Lnet/minecraft/commands/arguments/GameProfileArgument$Result;", cancellable = true)
    private void parse_247788778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(247788778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameProfiles(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getGameProfiles_2137216184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2137216184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameProfile()Lnet/minecraft/commands/arguments/GameProfileArgument;", cancellable = true)
    private static void gameProfile_410863131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(410863131L))
            info.setReturnValue(new net.minecraft.commands.arguments.GameProfileArgument());
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1229144871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1229144871L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__589650635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-589650635L))
            info.setReturnValue(null);
    }


}
