package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.EnderMan.class)
public class EnderMan_1398801882Mixin {
        @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setTarget_1720465212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1720465212L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isCreepy()Z", cancellable = true)
    private void isCreepy_1437080464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437080464L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_949371550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949371550L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1437076620(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1437076620L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSensitiveToWater()Z", cancellable = true)
    private void isSensitiveToWater_1437080464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437080464L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1250415971(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1250415971L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_698583436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(698583436L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "requiresCustomPersistence()Z", cancellable = true)
    private void requiresCustomPersistence_1437080464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437080464L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerEndTime()J", cancellable = true)
    private void getPersistentAngerEndTime_1437065088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437065088L))
            info.setReturnValue(-4271715314703967057L);
    }

    @Inject(at = @At("HEAD"), method = "startPersistentAngerTimer()V", cancellable = true)
    private void startPersistentAngerTimer_1437076620(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1437076620L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerTarget(Lnet/minecraft/world/entity/EntityReference;)V", cancellable = true)
    private void setPersistentAngerTarget__1506588594(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1506588594L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerEndTime(J)V", cancellable = true)
    private void setPersistentAngerEndTime__1681324922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1681324922L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerTarget()Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private void getPersistentAngerTarget__2033203750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2033203750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue_1613112852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613112852L))
            info.setReturnValue(2.339209E8F);
    }

    @Inject(at = @At("HEAD"), method = "hasBeenStaredAt()Z", cancellable = true)
    private void hasBeenStaredAt_1437080464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437080464L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCarriedBlock()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getCarriedBlock__896956985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-896956985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playStareSound()V", cancellable = true)
    private void playStareSound_1437076620(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1437076620L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBeingStaredAt()V", cancellable = true)
    private void setBeingStaredAt_1437076620(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1437076620L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCarriedBlock(Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setCarriedBlock_1253509051(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1253509051L))
            info.cancel();
    }


}
