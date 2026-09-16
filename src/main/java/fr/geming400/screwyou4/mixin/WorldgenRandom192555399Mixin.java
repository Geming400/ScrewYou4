package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.WorldgenRandom.class)
public class WorldgenRandom192555399Mixin {
        @Inject(at = @At("HEAD"), method = "next(I)I", cancellable = true)
    private void next_1950558361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950558361L))
            info.setReturnValue(267435798);
    }

    @Inject(at = @At("HEAD"), method = "getCount()I", cancellable = true)
    private void getCount__1193363532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1193363532L))
            info.setReturnValue(-2081941411);
    }

    @Inject(at = @At("HEAD"), method = "fork()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fork__1894677806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1894677806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSeed(J)V", cancellable = true)
    private void setSeed_1376495559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1376495559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forkPositional()Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void forkPositional_1782695327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1782695327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFeatureSeed(JII)V", cancellable = true)
    private void setFeatureSeed_1182898329(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1182898329L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDecorationSeed(JII)J", cancellable = true)
    private void setDecorationSeed_292116747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(292116747L))
            info.setReturnValue(4841488276418683479L);
    }

    @Inject(at = @At("HEAD"), method = "seedSlimeChunk(IIJJ)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private static void seedSlimeChunk__1737085802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1737085802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLargeFeatureWithSalt(JIII)V", cancellable = true)
    private void setLargeFeatureWithSalt__2099660448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2099660448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLargeFeatureSeed(JII)V", cancellable = true)
    private void setLargeFeatureSeed__1812010078(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1812010078L))
            info.cancel();
    }


}
