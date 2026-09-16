package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.ShulkerBullet.class)
public class ShulkerBullet_1100858656Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_971174997(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(971174997L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_285570802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285570802L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable__451675727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-451675727L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isOnFire()Z", cancellable = true)
    private void isOnFire__679202889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-679202889L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__1679851442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1679851442L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.UI);
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket_2112519372(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2112519372L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance_2055100695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055100695L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkDespawn()V", cancellable = true)
    private void checkDespawn__1453860448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1453860448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightLevelDependentMagicValue()F", cancellable = true)
    private void getLightLevelDependentMagicValue__1121025629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1121025629L))
            info.setReturnValue(8.175845E8F);
    }

    @Inject(at = @At("HEAD"), method = "hurtClient(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void hurtClient__1618919319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618919319L))
            info.setReturnValue(false);
    }


}
