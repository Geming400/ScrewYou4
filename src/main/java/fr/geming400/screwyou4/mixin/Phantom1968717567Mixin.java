package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Phantom.class)
public class Phantom1968717567Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2006992306(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2006992306L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__324330406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-324330406L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.MUSIC);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance__1116946518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116946518L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__680500285(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-680500285L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClimbable()Z", cancellable = true)
    private void onClimbable_2006996150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2006996150L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_726071523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726071523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "travel(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void travel__1958513730(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1958513730L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFlapping()Z", cancellable = true)
    private void isFlapping_2006996150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2006996150L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setPhantomSize(I)V", cancellable = true)
    private void setPhantomSize__1112332757(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1112332757L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhantomSize()I", cancellable = true)
    private void getPhantomSize_2006979813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2006979813L))
            info.setReturnValue(-1475494487);
    }

    @Inject(at = @At("HEAD"), method = "getUniqueFlapTickOffset()I", cancellable = true)
    private void getUniqueFlapTickOffset_2006979813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2006979813L))
            info.setReturnValue(-1475494487);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__477517791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-477517791L))
            info.setReturnValue(null);
    }


}
