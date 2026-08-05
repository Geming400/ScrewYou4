package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.ShulkerBullet.class)
public class ShulkerBullet_1100858656Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1139133394(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1139133394L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightLevelDependentMagicValue()F", cancellable = true)
    private void getLightLevelDependentMagicValue_1139118018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1139118018L))
            info.setReturnValue(2.626517E8F);
    }

    @Inject(at = @At("HEAD"), method = "isOnFire()Z", cancellable = true)
    private void isOnFire_1139137238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1139137238L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hurtClient(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void hurtClient_769189039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(769189039L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable_1139137238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1139137238L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance__1984805430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1984805430L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket__87930035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-87930035L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkDespawn()V", cancellable = true)
    private void checkDespawn_1139133394(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1139133394L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_651428324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(651428324L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__1192189318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192189318L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.RECORDS);
    }


}
