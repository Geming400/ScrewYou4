package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.RandomState.class)
public class RandomState1313600112Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/HolderGetter$Provider;Lnet/minecraft/resources/ResourceKey;J)Lnet/minecraft/world/level/levelgen/RandomState;", cancellable = true)
    private static void create_574233704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(574233704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/levelgen/NoiseGeneratorSettings;Lnet/minecraft/core/HolderGetter;J)Lnet/minecraft/world/level/levelgen/RandomState;", cancellable = true)
    private static void create__508605143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508605143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "router()Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private void router__1892716821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892716821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sampler()Lnet/minecraft/world/level/biome/Climate$Sampler;", cancellable = true)
    private void sampler_1409230606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1409230606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "surfaceSystem()Lnet/minecraft/world/level/levelgen/SurfaceSystem;", cancellable = true)
    private void surfaceSystem_531568261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(531568261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "oreRandom()Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void oreRandom__727611561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-727611561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateNoise(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/levelgen/synth/NormalNoise;", cancellable = true)
    private void getOrCreateNoise_216125020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216125020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aquiferRandom()Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void aquiferRandom__1307836156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1307836156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateRandomFactory(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void getOrCreateRandomFactory__1265631972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265631972L))
            info.setReturnValue(null);
    }


}
