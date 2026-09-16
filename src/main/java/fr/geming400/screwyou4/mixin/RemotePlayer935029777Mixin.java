package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.player.RemotePlayer.class)
public class RemotePlayer935029777Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_805346119(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(805346119L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1728639952(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1728639952L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance_1889271817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889271817L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket_1946690494(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1946690494L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtClient(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void hurtClient__1784748197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1784748197L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "lerpMotion(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void lerpMotion_1781757533(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1781757533L))
            info.cancel();
    }


}
