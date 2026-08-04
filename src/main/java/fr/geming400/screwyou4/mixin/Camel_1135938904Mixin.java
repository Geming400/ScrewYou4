package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.camel.Camel.class)
public class Camel_1135938904Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1174213642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1174213642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1542202551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542202551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/camel/Camel;", cancellable = true)
    private void getBreedOffspring_1084624762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1084624762L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1561239811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1561239811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_1174201149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174201149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onElasticLeashPull()V", cancellable = true)
    private void onElasticLeashPull_1174213642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1174213642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkCamelSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkCamelSpawnRules_293675209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293675209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canJump()Z", cancellable = true)
    private void canJump_1174217486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174217486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQuadLeashOffsets()[Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getQuadLeashOffsets_101773303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(101773303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__1133880634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1133880634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_435720458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(435720458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onPlayerJump(I)V", cancellable = true)
    private void onPlayerJump__1945111421(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1945111421L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleStartJump(I)V", cancellable = true)
    private void handleStartJump__1945111421(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1945111421L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openCustomInventoryScreen(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void openCustomInventoryScreen_2076540549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2076540549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleStopJump()V", cancellable = true)
    private void handleStopJump_1174213642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1174213642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getJumpCooldown()I", cancellable = true)
    private void getJumpCooldown_1174201149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174201149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "travel(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void travel_1503674902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1503674902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "standUp()V", cancellable = true)
    private void standUp_1174213642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1174213642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canSprint()Z", cancellable = true)
    private void canSprint_1174217486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174217486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__1566051535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1566051535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1513278949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1513278949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__106707141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-106707141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAgeScale()F", cancellable = true)
    private void getAgeScale_1174198266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174198266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1310296455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1310296455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTamed()Z", cancellable = true)
    private void isTamed_1174217486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174217486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDashing()Z", cancellable = true)
    private void isDashing_1174217486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174217486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDashing(Z)V", cancellable = true)
    private void setDashing__1929411564(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1929411564L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sitDown()V", cancellable = true)
    private void sitDown_1174213642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1174213642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__1424493261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1424493261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate_1698002409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698002409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCamelVisuallySitting()Z", cancellable = true)
    private void isCamelVisuallySitting_1174217486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174217486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPoseTime()J", cancellable = true)
    private void getPoseTime_1174202110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174202110L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "standUpInstantly()V", cancellable = true)
    private void standUpInstantly_1174213642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1174213642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isCamelSitting()Z", cancellable = true)
    private void isCamelSitting_1174217486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174217486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canCamelChangePose()Z", cancellable = true)
    private void canCamelChangePose_1174217486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174217486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInPoseTransition()Z", cancellable = true)
    private void isInPoseTransition_1174217486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174217486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refuseToMove()Z", cancellable = true)
    private void refuseToMove_1174217486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174217486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetLastPoseChangeTick(J)V", cancellable = true)
    private void resetLastPoseChangeTick__1944187900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1944187900L))
            info.cancel();
    }


}
