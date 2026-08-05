package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.camel.Camel.class)
public class Camel_1135938904Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1006255245(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1006255245L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1842673251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1842673251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1783926403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1783926403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_2131150195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131150195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAgeScale()F", cancellable = true)
    private void getAgeScale_499723161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(499723161L))
            info.setReturnValue(9.080104E8F);
    }

    @Inject(at = @At("HEAD"), method = "travel(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void travel__1409369040(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1409369040L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onElasticLeashPull()V", cancellable = true)
    private void onElasticLeashPull_1951894686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1951894686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__302726688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302726688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQuadLeashOffsets()[Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getQuadLeashOffsets_981163895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(981163895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSprint()Z", cancellable = true)
    private void canSprint__1783068860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1783068860L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_950036977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950036977L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "standUp()V", cancellable = true)
    private void standUp_1529669017(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1529669017L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1149872865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1149872865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/camel/Camel;", cancellable = true)
    private void getBreedOffspring_1368962584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1368962584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1275823003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1275823003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_1644385745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1644385745L))
            info.setReturnValue(-304960902);
    }

    @Inject(at = @At("HEAD"), method = "onPlayerJump(I)V", cancellable = true)
    private void onPlayerJump_1047876593(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1047876593L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleStartJump(I)V", cancellable = true)
    private void handleStartJump_470733035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(470733035L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getJumpCooldown()I", cancellable = true)
    private void getJumpCooldown__751483794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-751483794L))
            info.setReturnValue(-2059958884);
    }

    @Inject(at = @At("HEAD"), method = "handleStopJump()V", cancellable = true)
    private void handleStopJump__190740110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-190740110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1111812491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1111812491L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate_764579412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(764579412L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "openCustomInventoryScreen(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void openCustomInventoryScreen__2143113768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2143113768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canJump()Z", cancellable = true)
    private void canJump_1019086256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019086256L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1886037212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886037212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDashing(Z)V", cancellable = true)
    private void setDashing__826621470(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-826621470L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDashing()Z", cancellable = true)
    private void isDashing__2088806328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2088806328L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "sitDown()V", cancellable = true)
    private void sitDown_1030324586(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1030324586L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetLastPoseChangeTick(J)V", cancellable = true)
    private void resetLastPoseChangeTick__944945529(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-944945529L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canCamelChangePose()Z", cancellable = true)
    private void canCamelChangePose__1569703001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569703001L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkCamelSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkCamelSpawnRules_854523039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854523039L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "refuseToMove()Z", cancellable = true)
    private void refuseToMove__562200338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-562200338L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "standUpInstantly()V", cancellable = true)
    private void standUpInstantly_1206349069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1206349069L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isCamelSitting()Z", cancellable = true)
    private void isCamelSitting__133102194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-133102194L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isInPoseTransition()Z", cancellable = true)
    private void isInPoseTransition_1181361561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1181361561L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isCamelVisuallySitting()Z", cancellable = true)
    private void isCamelVisuallySitting__537082117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-537082117L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPoseTime()J", cancellable = true)
    private void getPoseTime_1788650250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1788650250L))
            info.setReturnValue(3547991102026518320L);
    }

    @Inject(at = @At("HEAD"), method = "isTamed()Z", cancellable = true)
    private void isTamed_1794607865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1794607865L))
            info.setReturnValue(false);
    }


}
