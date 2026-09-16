package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Strider.class)
public class Strider_1970312789Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1840629130(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1840629130L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isOnFire()Z", cancellable = true)
    private void isOnFire_190251244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190251244L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot_2045886260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2045886260L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isSuffocating()Z", cancellable = true)
    private void isSuffocating_1029477468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1029477468L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__949552518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-949552518L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getLiquidCollisionShape()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getLiquidCollisionShape_1140690839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1140690839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getControllingPassenger()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getControllingPassenger__1435566892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1435566892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canStandOnFluid(Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void canStandOnFluid_1749832500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1749832500L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1329443216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1329443216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSensitiveToWater()Z", cancellable = true)
    private void isSensitiveToWater__775930661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-775930661L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1617920160(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1617920160L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDismountLocationForPassenger(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getDismountLocationForPassenger__1259547132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1259547132L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSuffocating(Z)V", cancellable = true)
    private void setSuffocating_1227871912(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1227871912L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkStriderSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkStriderSpawnRules__1039078471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1039078471L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_2110196888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110196888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/monster/Strider;", cancellable = true)
    private void getBreedOffspring__528822729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-528822729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue_429326606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(429326606L))
            info.setReturnValue(9.741039E8F);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__315498980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315498980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction__1493172028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493172028L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__784471565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-784471565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1574556199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1574556199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1946186376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946186376L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "boost()Z", cancellable = true)
    private void boost__645704120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645704120L))
            info.setReturnValue(true);
    }


}
