package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.wolf.Wolf.class)
public class Wolf_1261583822Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1098491416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098491416L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1299858560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1299858560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTexture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTexture__1181482732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1181482732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWetShade(F)F", cancellable = true)
    private void getWetShade__1822252442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1822252442L))
            info.setReturnValue(6.114307E8F);
    }

    @Inject(at = @At("HEAD"), method = "getShakeAnim(F)F", cancellable = true)
    private void getShakeAnim__1822252442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1822252442L))
            info.setReturnValue(6.114307E8F);
    }

    @Inject(at = @At("HEAD"), method = "getTailAngle()F", cancellable = true)
    private void getTailAngle_1299843184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1299843184L))
            info.setReturnValue(6.114307E8F);
    }

    @Inject(at = @At("HEAD"), method = "checkWolfSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkWolfSpawnRules_419320127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(419320127L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_812153490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(812153490L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setIsInterested(Z)V", cancellable = true)
    private void setIsInterested__1803766646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1803766646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeadRollAngle(F)F", cancellable = true)
    private void getHeadRollAngle__1822252442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1822252442L))
            info.setReturnValue(6.114307E8F);
    }

    @Inject(at = @At("HEAD"), method = "isInterested()Z", cancellable = true)
    private void isInterested_1299862404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1299862404L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "startPersistentAngerTimer()V", cancellable = true)
    private void startPersistentAngerTimer_1299858560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1299858560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerEndTime()J", cancellable = true)
    private void getPersistentAngerEndTime_1299847028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1299847028L))
            info.setReturnValue(-5859072145082044147L);
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerTarget(Lnet/minecraft/world/entity/EntityReference;)V", cancellable = true)
    private void setPersistentAngerTarget__1643806654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1643806654L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerTarget()Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private void getPersistentAngerTarget_2124545486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124545486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerEndTime(J)V", cancellable = true)
    private void setPersistentAngerEndTime__1818542982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1818542982L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_1299862404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1299862404L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__1825931150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1825931150L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_561365376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561365376L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_18937777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(18937777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxSpawnClusterSize()I", cancellable = true)
    private void getMaxSpawnClusterSize_1299846067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1299846067L))
            info.setReturnValue(-282962432);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadXRot()I", cancellable = true)
    private void getMaxHeadXRot_1299846067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1299846067L))
            info.setReturnValue(-282962432);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1416557633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1416557633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1435594893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1435594893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/wolf/Wolf;", cancellable = true)
    private void getBreedOffspring__752874914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-752874914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1299858560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1299858560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "die(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void die_929910361(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(929910361L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCollarColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getCollarColor__1598075245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1598075245L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.LIME);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__1935653946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1935653946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate_1823647327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823647327L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__1298848343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1298848343L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "wantsToAttack(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void wantsToAttack_1313216900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313216900L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1184651537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1184651537L))
            info.setReturnValue(null);
    }


}
