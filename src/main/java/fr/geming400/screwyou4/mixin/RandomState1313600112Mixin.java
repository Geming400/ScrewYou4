package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.RandomState.class)
public class RandomState1313600112Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/HolderGetter$Provider;Lnet/minecraft/resources/ResourceKey;J)Lnet/minecraft/world/level/levelgen/RandomState;", cancellable = true)
    private static void create_787552620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787552620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/levelgen/NoiseGeneratorSettings;Lnet/minecraft/core/HolderGetter;J)Lnet/minecraft/world/level/levelgen/RandomState;", cancellable = true)
    private static void create_1685231269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1685231269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "router()Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private void router_157596194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(157596194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "surfaceSystem()Lnet/minecraft/world/level/levelgen/SurfaceSystem;", cancellable = true)
    private void surfaceSystem_1981580873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1981580873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aquiferRandom()Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void aquiferRandom_87482642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87482642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateNoise(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/levelgen/synth/NormalNoise;", cancellable = true)
    private void getOrCreateNoise__1309716255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1309716255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sampler()Lnet/minecraft/world/level/biome/Climate$Sampler;", cancellable = true)
    private void sampler_1749185046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1749185046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateRandomFactory(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void getOrCreateRandomFactory__1408970870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1408970870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "oreRandom()Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void oreRandom_87482642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87482642L))
            info.setReturnValue(null);
    }


}
