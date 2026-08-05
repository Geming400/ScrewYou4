package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.breeze.Breeze.class)
public class Breeze_1646514639Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_914276523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(914276523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1684789377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1684789377L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHurtBy()Ljava/util/Optional;", cancellable = true)
    private void getHurtBy_1891976060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1891976060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "causeFallDamage(DFLnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void causeFallDamage_1168373660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1168373660L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFluidJumpThreshold()D", cancellable = true)
    private void getFluidJumpThreshold_1684772079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684772079L))
            info.setReturnValue(3.7136880080753183E8D);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1002703214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1002703214L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerDebugValues(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/debug/DebugValueSource$Registration;)V", cancellable = true)
    private void registerDebugValues__1420175566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1420175566L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInvulnerableTo(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void isInvulnerableTo_1215584109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1215584109L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_946296193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(946296193L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_1684776884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684776884L))
            info.setReturnValue(-953125333);
    }

    @Inject(at = @At("HEAD"), method = "getHeadRotSpeed()I", cancellable = true)
    private void getHeadRotSpeed_1684776884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684776884L))
            info.setReturnValue(-953125333);
    }

    @Inject(at = @At("HEAD"), method = "deflection(Lnet/minecraft/world/entity/projectile/Projectile;)Lnet/minecraft/world/entity/projectile/ProjectileDeflection;", cancellable = true)
    private void deflection_2079877172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2079877172L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canAttack(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void canAttack_1968181813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968181813L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__1055475800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055475800L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "emitGroundParticles(I)V", cancellable = true)
    private void emitGroundParticles__1434535686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1434535686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emitJumpTrailParticles()V", cancellable = true)
    private void emitJumpTrailParticles_1684789377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1684789377L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetJumpTrail()Lnet/minecraft/world/entity/monster/breeze/Breeze;", cancellable = true)
    private void resetJumpTrail_2085708765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085708765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withinInnerCircleRange(Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void withinInnerCircleRange_2014254481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2014254481L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "playWhirlSound()V", cancellable = true)
    private void playWhirlSound_1684789377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1684789377L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFiringYPosition()D", cancellable = true)
    private void getFiringYPosition_1684772079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684772079L))
            info.setReturnValue(3.7136880080753183E8D);
    }

    @Inject(at = @At("HEAD"), method = "playAmbientSound()V", cancellable = true)
    private void playAmbientSound_1684789377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1684789377L))
            info.cancel();
    }


}
