package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.creaking.Creaking.class)
public class Creaking_833466454Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_796867083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796867083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive__1680910532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1680910532L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "push(DDD)V", cancellable = true)
    private void push_1424590998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1424590998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_703782795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(703782795L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deactivate()V", cancellable = true)
    private void deactivate__976351468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-976351468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__2086398853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2086398853L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget_1749125599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1749125599L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "playAttackSound()V", cancellable = true)
    private void playAttackSound_839956245(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(839956245L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUsePortal(Z)Z", cancellable = true)
    private void canUsePortal__26123591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-26123591L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1587214569(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1587214569L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_18178600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(18178600L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "knockback(DDDLnet/minecraft/world/damagesource/DamageSource;F)V", cancellable = true)
    private void knockback__586173068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-586173068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "activate(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void activate_1115124784(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1115124784L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fireImmune()Z", cancellable = true)
    private void fireImmune_1603848019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1603848019L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPushable()Z", cancellable = true)
    private void isPushable__1561952754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1561952754L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tearDown()V", cancellable = true)
    private void tearDown_1129419620(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1129419620L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "creakingDeathEffects(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void creakingDeathEffects_397387089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(397387089L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerIsStuckInYou()Z", cancellable = true)
    private void playerIsStuckInYou__1835543325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1835543325L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setTransient(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setTransient__1577148636(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1577148636L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTearingDown()V", cancellable = true)
    private void setTearingDown_537864648(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(537864648L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1830203276(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1830203276L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_647564527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(647564527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue__707519729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-707519729L))
            info.setReturnValue(3.193007E8F);
    }

    @Inject(at = @At("HEAD"), method = "getHomePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getHomePos__605824777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-605824777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setHomePos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setHomePos__1512096177(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1512096177L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blameSourceForDamage(Lnet/minecraft/world/damagesource/DamageSource;)Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private void blameSourceForDamage_1696496136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1696496136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkCanMove()Z", cancellable = true)
    private void checkCanMove__1654154221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654154221L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkEyeBlink()V", cancellable = true)
    private void checkEyeBlink_1655445013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1655445013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isHeartBound()Z", cancellable = true)
    private void isHeartBound_1758980522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758980522L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isTearingDown()Z", cancellable = true)
    private void isTearingDown_2116221332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116221332L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasGlowingEyes()Z", cancellable = true)
    private void hasGlowingEyes__579098129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-579098129L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setIsActive(Z)V", cancellable = true)
    private void setIsActive__992022300(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-992022300L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canMove()Z", cancellable = true)
    private void canMove_1099935467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099935467L))
            info.setReturnValue(true);
    }


}
