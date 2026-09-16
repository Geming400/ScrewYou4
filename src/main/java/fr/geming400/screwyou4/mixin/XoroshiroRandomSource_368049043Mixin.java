package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.XoroshiroRandomSource.class)
public class XoroshiroRandomSource_368049043Mixin {
        @Inject(at = @At("HEAD"), method = "nextDouble()D", cancellable = true)
    private void nextDouble_410375311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(410375311L))
            info.setReturnValue(3.0502980012756485E8D);
    }

    @Inject(at = @At("HEAD"), method = "nextInt(I)I", cancellable = true)
    private void nextInt_1119916269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119916269L))
            info.setReturnValue(-148762099);
    }

    @Inject(at = @At("HEAD"), method = "nextInt()I", cancellable = true)
    private void nextInt__162782468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162782468L))
            info.setReturnValue(-2051927199);
    }

    @Inject(at = @At("HEAD"), method = "fork()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fork__1719184163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1719184163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nextLong()J", cancellable = true)
    private void nextLong__1816530294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1816530294L))
            info.setReturnValue(6494178520856020012L);
    }

    @Inject(at = @At("HEAD"), method = "setSeed(J)V", cancellable = true)
    private void setSeed_1551988210(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1551988210L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextBoolean()Z", cancellable = true)
    private void nextBoolean_843122868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843122868L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "nextFloat()F", cancellable = true)
    private void nextFloat__2032054100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2032054100L))
            info.setReturnValue(3.050298E8F);
    }

    @Inject(at = @At("HEAD"), method = "nextGaussian()D", cancellable = true)
    private void nextGaussian_240098661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240098661L))
            info.setReturnValue(3.050298007440654E8D);
    }

    @Inject(at = @At("HEAD"), method = "forkPositional()Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void forkPositional_1958188970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958188970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "consumeCount(I)V", cancellable = true)
    private void consumeCount__1176141071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1176141071L))
            info.cancel();
    }


}
