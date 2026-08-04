package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Guardian.class)
public class Guardian80091781Mixin {
        @Inject(at = @At("HEAD"), method = "getAmbientSoundInterval()I", cancellable = true)
    private void getAmbientSoundInterval_118354027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(118354027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue_294402752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(294402752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadXRot()I", cancellable = true)
    private void getMaxHeadXRot_118354027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(118354027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkGuardianSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkGuardianSpawnRules__762171913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762171913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getActiveAttackTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getActiveAttackTarget__652146334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-652146334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasActiveAttackTarget()Z", cancellable = true)
    private void hasActiveAttackTarget_118370364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(118370364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpikesAnimation(F)F", cancellable = true)
    private void getSpikesAnimation_1291222814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291222814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTailAnimation(F)F", cancellable = true)
    private void getTailAnimation_1291222814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291222814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttackAnimationScale(F)F", cancellable = true)
    private void getAttackAnimationScale_1291222814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291222814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClientSideAttackTime()F", cancellable = true)
    private void getClientSideAttackTime_118351144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(118351144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__620126664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620126664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isMoving()Z", cancellable = true)
    private void isMoving_118370364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(118370364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_118366520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(118366520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__369338550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-369338550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1725841225(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1725841225L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction_1117245992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1117245992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMoving(Z)V", cancellable = true)
    private void setMoving_1309708610(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1309708610L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAttackDuration()I", cancellable = true)
    private void getAttackDuration_118354027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(118354027L))
            info.setReturnValue(null);
    }


}
