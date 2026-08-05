package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.creaking.Creaking.class)
public class Creaking_833466454Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_101228338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(101228338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive_871745036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871745036L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "push(DDD)V", cancellable = true)
    private void push__236940420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-236940420L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_871741192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(871741192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deactivate()V", cancellable = true)
    private void deactivate_871741192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(871741192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_384036122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(384036122L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "playAttackSound()V", cancellable = true)
    private void playAttackSound_871741192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(871741192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget__1817461132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1817461132L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tearDown()V", cancellable = true)
    private void tearDown_871741192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(871741192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_2040918778(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2040918778L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUsePortal(Z)Z", cancellable = true)
    private void canUsePortal_2063087126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063087126L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_133248008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(133248008L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "knockback(DDDLnet/minecraft/world/damagesource/DamageSource;F)V", cancellable = true)
    private void knockback_1525229241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1525229241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "activate(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void activate_1774068099(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1774068099L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fireImmune()Z", cancellable = true)
    private void fireImmune_871745036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871745036L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPushable()Z", cancellable = true)
    private void isPushable_871745036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871745036L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue_1047777424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1047777424L))
            info.setReturnValue(2.382887E8F);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_871741192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(871741192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__1868523985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1868523985L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "checkCanMove()Z", cancellable = true)
    private void checkCanMove_871745036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871745036L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkEyeBlink()V", cancellable = true)
    private void checkEyeBlink_871741192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(871741192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blameSourceForDamage(Lnet/minecraft/world/damagesource/DamageSource;)Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private void blameSourceForDamage_1784252886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1784252886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasGlowingEyes()Z", cancellable = true)
    private void hasGlowingEyes_871745036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871745036L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setIsActive(Z)V", cancellable = true)
    private void setIsActive_2063083282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2063083282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTearingDown()Z", cancellable = true)
    private void isTearingDown_871745036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871745036L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isHeartBound()Z", cancellable = true)
    private void isHeartBound_871745036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871745036L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setTransient(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setTransient_1002233052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1002233052L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerIsStuckInYou()Z", cancellable = true)
    private void playerIsStuckInYou_871745036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871745036L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "creakingDeathEffects(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void creakingDeathEffects_501792993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(501792993L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTearingDown()V", cancellable = true)
    private void setTearingDown_871741192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(871741192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHomePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getHomePos__1059920426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1059920426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setHomePos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setHomePos_1002233052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1002233052L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canMove()Z", cancellable = true)
    private void canMove_871745036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871745036L))
            info.setReturnValue(false);
    }


}
