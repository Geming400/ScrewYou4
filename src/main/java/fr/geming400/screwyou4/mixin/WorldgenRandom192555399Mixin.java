package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.WorldgenRandom.class)
public class WorldgenRandom192555399Mixin {
        @Inject(at = @At("HEAD"), method = "next(I)I", cancellable = true)
    private void next_1406459878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1406459878L))
            info.setReturnValue(286127939);
    }

    @Inject(at = @At("HEAD"), method = "getCount()I", cancellable = true)
    private void getCount_230817645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(230817645L))
            info.setReturnValue(-2066467035);
    }

    @Inject(at = @At("HEAD"), method = "fork()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fork__1857069484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857069484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSeed(J)V", cancellable = true)
    private void setSeed_1407396884(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1407396884L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDecorationSeed(JII)J", cancellable = true)
    private void setDecorationSeed_299955144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(299955144L))
            info.setReturnValue(45051057054078807L);
    }

    @Inject(at = @At("HEAD"), method = "setFeatureSeed(JII)V", cancellable = true)
    private void setFeatureSeed_299966676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(299966676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forkPositional()Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void forkPositional__1033562071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033562071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLargeFeatureWithSalt(JIII)V", cancellable = true)
    private void setLargeFeatureWithSalt__745262247(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-745262247L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLargeFeatureSeed(JII)V", cancellable = true)
    private void setLargeFeatureSeed_299966676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(299966676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "seedSlimeChunk(IIJJ)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private static void seedSlimeChunk_1901176236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901176236L))
            info.setReturnValue(null);
    }


}
