package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.XoroshiroRandomSource.class)
public class XoroshiroRandomSource_368049043Mixin {
        @Inject(at = @At("HEAD"), method = "nextDouble()D", cancellable = true)
    private void nextDouble_406306483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406306483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nextInt(I)I", cancellable = true)
    private void nextInt_1581953521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1581953521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nextInt()I", cancellable = true)
    private void nextInt_406311288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406311288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fork()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fork__1681575841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1681575841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nextLong()J", cancellable = true)
    private void nextLong_406312249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406312249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSeed(J)V", cancellable = true)
    private void setSeed_1582889535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1582889535L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextBoolean()Z", cancellable = true)
    private void nextBoolean_406327625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406327625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nextFloat()F", cancellable = true)
    private void nextFloat_406308405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406308405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nextGaussian()D", cancellable = true)
    private void nextGaussian_406306483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406306483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "consumeCount(I)V", cancellable = true)
    private void consumeCount_1581966014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1581966014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forkPositional()Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void forkPositional__858068428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-858068428L))
            info.setReturnValue(null);
    }


}
