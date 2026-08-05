package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.HexColorArgument.class)
public class HexColorArgument855168207Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1816428301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816428301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Integer;", cancellable = true)
    private void parse_1899624742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899624742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hexColor()Lnet/minecraft/commands/arguments/HexColorArgument;", cancellable = true)
    private static void hexColor__681913134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-681913134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_103610416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(103610416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1715185090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1715185090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHexColor(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/lang/Integer;", cancellable = true)
    private static void getHexColor_374805603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(374805603L))
            info.setReturnValue(null);
    }


}
