package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.StringRepresentableArgument.class)
public class StringRepresentableArgument1405198816Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1928508386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1928508386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Enum;", cancellable = true)
    private void parse_777825372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777825372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1165154481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1165154481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_653641025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(653641025L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
