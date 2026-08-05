package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.LightningBolt.class)
public class LightningBolt149596977Mixin {
        @Inject(at = @At("HEAD"), method = "getCause()Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void getCause__847463506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-847463506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCause(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void setCause__619964876(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-619964876L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_187871716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(187871716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHitEntities()Ljava/util/stream/Stream;", cancellable = true)
    private void getHitEntities__61109338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-61109338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlocksSetOnFire()I", cancellable = true)
    private void getBlocksSetOnFire_187859223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(187859223L))
            info.setReturnValue(1650365765);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__2143450996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2143450996L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.NEUTRAL);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__299832858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-299832858L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setVisualOnly(Z)V", cancellable = true)
    private void setVisualOnly_1379213806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1379213806L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance_1358900188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1358900188L))
            info.setReturnValue(false);
    }


}
