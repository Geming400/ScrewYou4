package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ParticleArgument.class)
public class ParticleArgument_1443587891Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1890119312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1890119312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void parse_277863017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277863017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particle(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ParticleArgument;", cancellable = true)
    private static void particle__158595633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-158595633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_692030099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(692030099L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1126765407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126765407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readParticle(Lcom/mojang/brigadier/StringReader;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private static void readParticle__948313188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-948313188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParticle(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private static void getParticle_1992968254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1992968254L))
            info.setReturnValue(null);
    }


}
