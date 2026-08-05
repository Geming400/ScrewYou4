package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.player.RemotePlayer.class)
public class RemotePlayer935029777Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_973304516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(973304516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance_2144332988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2144332988L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket__253758913(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-253758913L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lerpMotion(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void lerpMotion_1302765776(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1302765776L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtClient(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void hurtClient_603360161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(603360161L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_973304516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(973304516L))
            info.cancel();
    }


}
