package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.HexColorArgument.class)
public class HexColorArgument855168207Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_561786464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561786464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Integer;", cancellable = true)
    private void parse_1660433459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1660433459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1096091649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096091649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hexColor()Lnet/minecraft/commands/arguments/HexColorArgument;", cancellable = true)
    private static void hexColor__435207462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-435207462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__958480065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-958480065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHexColor(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/lang/Integer;", cancellable = true)
    private static void getHexColor_543061093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(543061093L))
            info.setReturnValue(null);
    }


}
