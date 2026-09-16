package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Phantom.class)
public class Phantom1968717567Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1839033909(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1839033909L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "travel(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void travel__576590376(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-576590376L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClimbable()Z", cancellable = true)
    private void onClimbable__1620073402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620073402L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__811992530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811992530L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.NEUTRAL);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance__1372007689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1372007689L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1331038437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1331038437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1619515381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1619515381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFlapping()Z", cancellable = true)
    private void isFlapping_1858852261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1858852261L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setPhantomSize(I)V", cancellable = true)
    private void setPhantomSize_642554903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(642554903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhantomSize()I", cancellable = true)
    private void getPhantomSize_5086317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(5086317L))
            info.setReturnValue(480678856);
    }

    @Inject(at = @At("HEAD"), method = "getUniqueFlapTickOffset()I", cancellable = true)
    private void getUniqueFlapTickOffset__1740573735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740573735L))
            info.setReturnValue(-729675232);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1576151420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1576151420L))
            info.setReturnValue(null);
    }


}
