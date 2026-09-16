package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.EnderMan.class)
public class EnderMan_1398801882Mixin {
        @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setTarget_1541207695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1541207695L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1264867848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1264867848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_583514028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583514028L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1521063425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1521063425L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "isSensitiveToWater()Z", cancellable = true)
    private void isSensitiveToWater__1347441568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1347441568L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_2105536229(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2105536229L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue__142184301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-142184301L))
            info.setReturnValue(5.57858E8F);
    }

    @Inject(at = @At("HEAD"), method = "requiresCustomPersistence()Z", cancellable = true)
    private void requiresCustomPersistence_1092301616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1092301616L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerTarget(Lnet/minecraft/world/entity/EntityReference;)V", cancellable = true)
    private void setPersistentAngerTarget__2123479025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2123479025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerEndTime()J", cancellable = true)
    private void getPersistentAngerEndTime__226434862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-226434862L))
            info.setReturnValue(-8892126421326359248L);
    }

    @Inject(at = @At("HEAD"), method = "startPersistentAngerTimer()V", cancellable = true)
    private void startPersistentAngerTimer_23803381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(23803381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerEndTime(J)V", cancellable = true)
    private void setPersistentAngerEndTime__1795583872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1795583872L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerTarget()Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private void getPersistentAngerTarget__20656251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-20656251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCreepy()Z", cancellable = true)
    private void isCreepy__858978450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-858978450L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setBeingStaredAt()V", cancellable = true)
    private void setBeingStaredAt_1612155403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1612155403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasBeenStaredAt()Z", cancellable = true)
    private void hasBeenStaredAt_1097256774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097256774L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setCarriedBlock(Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setCarriedBlock__1954318122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1954318122L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playStareSound()V", cancellable = true)
    private void playStareSound__828176452(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-828176452L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCarriedBlock()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getCarriedBlock__1369814208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1369814208L))
            info.setReturnValue(null);
    }


}
