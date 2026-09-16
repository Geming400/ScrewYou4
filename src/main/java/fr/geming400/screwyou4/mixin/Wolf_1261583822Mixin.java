package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.wolf.Wolf.class)
public class Wolf_1261583822Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__1366676242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1366676242L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1131900163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1131900163L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_446295968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446295968L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "die(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void die__909274407(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-909274407L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1402085908(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1402085908L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1658281485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1658281485L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_2015331937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2015331937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__2038172183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2038172183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed__686488293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-686488293L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getCollarColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getCollarColor__1836319613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1836319613L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.LIGHT_BLUE);
    }

    @Inject(at = @At("HEAD"), method = "getTexture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTexture_164989177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(164989177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShakeAnim(F)F", cancellable = true)
    private void getShakeAnim__906018521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-906018521L))
            info.setReturnValue(1.727351E8F);
    }

    @Inject(at = @At("HEAD"), method = "getWetShade(F)F", cancellable = true)
    private void getWetShade_989366403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(989366403L))
            info.setReturnValue(1.727351E8F);
    }

    @Inject(at = @At("HEAD"), method = "getTailAngle()F", cancellable = true)
    private void getTailAngle_1907348707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1907348707L))
            info.setReturnValue(1.727351E8F);
    }

    @Inject(at = @At("HEAD"), method = "checkWolfSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkWolfSpawnRules_388729513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(388729513L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerEndTime(J)V", cancellable = true)
    private void setPersistentAngerEndTime__1932801932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1932801932L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startPersistentAngerTimer()V", cancellable = true)
    private void startPersistentAngerTimer__113414679(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-113414679L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerTarget(Lnet/minecraft/world/entity/EntityReference;)V", cancellable = true)
    private void setPersistentAngerTarget_2034270211(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2034270211L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerTarget()Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private void getPersistentAngerTarget__157874311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-157874311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerEndTime()J", cancellable = true)
    private void getPersistentAngerEndTime__363652922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-363652922L))
            info.setReturnValue(-2154123386863014532L);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/wolf/Wolf;", cancellable = true)
    private void getBreedOffspring__953696132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-953696132L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1401467921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1401467921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1024227947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1024227947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadXRot()I", cancellable = true)
    private void getMaxHeadXRot__717482170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-717482170L))
            info.setReturnValue(2047373639);
    }

    @Inject(at = @At("HEAD"), method = "getMaxSpawnClusterSize()I", cancellable = true)
    private void getMaxSpawnClusterSize_1013897093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013897093L))
            info.setReturnValue(120762149);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__1493200532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493200532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_2011682130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2011682130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1237457409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1237457409L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate_890224330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(890224330L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isInterested()Z", cancellable = true)
    private void isInterested_1712429393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712429393L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setIsInterested(Z)V", cancellable = true)
    private void setIsInterested_961940575(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(961940575L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeadRollAngle(F)F", cancellable = true)
    private void getHeadRollAngle_1750606598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1750606598L))
            info.setReturnValue(1.737408E8F);
    }

    @Inject(at = @At("HEAD"), method = "wantsToAttack(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void wantsToAttack_1021402270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1021402270L))
            info.setReturnValue(false);
    }


}
