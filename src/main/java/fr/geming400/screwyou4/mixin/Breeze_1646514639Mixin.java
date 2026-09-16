package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.breeze.Breeze.class)
public class Breeze_1646514639Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_1609915268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1609915268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1516830980(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1516830980L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInvulnerableTo(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void isInvulnerableTo__101933633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-101933633L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canAttack(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void canAttack_184954477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(184954477L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_1460612712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1460612712L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "causeFallDamage(DFLnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void causeFallDamage__1340345489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1340345489L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1273350668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1273350668L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "registerDebugValues(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/debug/DebugValueSource$Registration;)V", cancellable = true)
    private void registerDebugValues_1187427264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1187427264L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deflection(Lnet/minecraft/world/entity/projectile/Projectile;)Lnet/minecraft/world/entity/projectile/ProjectileDeflection;", cancellable = true)
    private void deflection__945820563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945820563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidJumpThreshold()D", cancellable = true)
    private void getFluidJumpThreshold__706555290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706555290L))
            info.setReturnValue(9.902571001634214E8D);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1941718310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1941718310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emitGroundParticles(I)V", cancellable = true)
    private void emitGroundParticles_569530189(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(569530189L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playWhirlSound()V", cancellable = true)
    private void playWhirlSound_885530768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(885530768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withinInnerCircleRange(Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void withinInnerCircleRange__1570581197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1570581197L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "emitJumpTrailParticles()V", cancellable = true)
    private void emitJumpTrailParticles__1345267399(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1345267399L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFiringYPosition()D", cancellable = true)
    private void getFiringYPosition_1510124086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510124086L))
            info.setReturnValue(9.902571006541138E8D);
    }

    @Inject(at = @At("HEAD"), method = "resetJumpTrail()Lnet/minecraft/world/entity/monster/breeze/Breeze;", cancellable = true)
    private void resetJumpTrail_325992710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(325992710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot__2140005816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2140005816L))
            info.setReturnValue(798279714);
    }

    @Inject(at = @At("HEAD"), method = "getHeadRotSpeed()I", cancellable = true)
    private void getHeadRotSpeed__1935301042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1935301042L))
            info.setReturnValue(-1067617569);
    }

    @Inject(at = @At("HEAD"), method = "getHurtBy()Ljava/util/Optional;", cancellable = true)
    private void getHurtBy__2083111112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083111112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playAmbientSound()V", cancellable = true)
    private void playAmbientSound_1123210422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1123210422L))
            info.cancel();
    }


}
