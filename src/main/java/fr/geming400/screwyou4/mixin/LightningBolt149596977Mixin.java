package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.LightningBolt.class)
public class LightningBolt149596977Mixin {
        @Inject(at = @At("HEAD"), method = "getCause()Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void getCause__1077385253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1077385253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCause(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void setCause_1803542299(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1803542299L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_19913319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(19913319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__665690380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-665690380L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource_1663854176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1663854176L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.BLOCKS);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance_1103839017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1103839017L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setVisualOnly(Z)V", cancellable = true)
    private void setVisualOnly__1854529412(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1854529412L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHitEntities()Ljava/util/stream/Stream;", cancellable = true)
    private void getHitEntities_1124645160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1124645160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlocksSetOnFire()I", cancellable = true)
    private void getBlocksSetOnFire_1467623260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467623260L))
            info.setReturnValue(1434349206);
    }


}
