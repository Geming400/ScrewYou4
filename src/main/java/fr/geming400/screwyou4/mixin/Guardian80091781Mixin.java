package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Guardian.class)
public class Guardian80091781Mixin {
        @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_786826129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(786826129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1455193771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455193771L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__735196072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-735196072L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction_911574261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(911574261L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1711389348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1711389348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue__1460894401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1460894401L))
            info.setReturnValue(4.102516E8F);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadXRot()I", cancellable = true)
    private void getMaxHeadXRot__1898974210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1898974210L))
            info.setReturnValue(-1292635354);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSoundInterval()I", cancellable = true)
    private void getAmbientSoundInterval__99030023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-99030023L))
            info.setReturnValue(-875573796);
    }

    @Inject(at = @At("HEAD"), method = "hasActiveAttackTarget()Z", cancellable = true)
    private void hasActiveAttackTarget_1388475267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1388475267L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getClientSideAttackTime()F", cancellable = true)
    private void getClientSideAttackTime_1095056955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095056955L))
            info.setReturnValue(4.102516E8F);
    }

    @Inject(at = @At("HEAD"), method = "getActiveAttackTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getActiveAttackTarget__1749969555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749969555L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkGuardianSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkGuardianSpawnRules_860095170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(860095170L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAttackAnimationScale(F)F", cancellable = true)
    private void getAttackAnimationScale_790172962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(790172962L))
            info.setReturnValue(4.102516E8F);
    }

    @Inject(at = @At("HEAD"), method = "getSpikesAnimation(F)F", cancellable = true)
    private void getSpikesAnimation__1384029953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1384029953L))
            info.setReturnValue(4.102516E8F);
    }

    @Inject(at = @At("HEAD"), method = "getTailAnimation(F)F", cancellable = true)
    private void getTailAnimation_986390012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(986390012L))
            info.setReturnValue(4.102516E8F);
    }

    @Inject(at = @At("HEAD"), method = "getAttackDuration()I", cancellable = true)
    private void getAttackDuration__1102933319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1102933319L))
            info.setReturnValue(-1154259970);
    }

    @Inject(at = @At("HEAD"), method = "isMoving()Z", cancellable = true)
    private void isMoving_1641162020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1641162020L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setMoving(Z)V", cancellable = true)
    private void setMoving_275240082(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(275240082L))
            info.cancel();
    }


}
