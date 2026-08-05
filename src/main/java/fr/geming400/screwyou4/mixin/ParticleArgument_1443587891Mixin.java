package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ParticleArgument.class)
public class ParticleArgument_1443587891Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1150206147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1150206147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void parse_1600266044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1600266044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particle(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ParticleArgument;", cancellable = true)
    private static void particle__1768783339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1768783339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readParticle(Lcom/mojang/brigadier/StringReader;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private static void readParticle__1480847016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1480847016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1684511332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684511332L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__370060382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-370060382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParticle(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private static void getParticle_1919429818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919429818L))
            info.setReturnValue(null);
    }


}
