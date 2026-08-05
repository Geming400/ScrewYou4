package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Strider.class)
public class Strider_1970312789Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2008587527(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2008587527L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canStandOnFluid(Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void canStandOnFluid__1964529329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1964529329L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getLiquidCollisionShape()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getLiquidCollisionShape_88642870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88642870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSensitiveToWater()Z", cancellable = true)
    private void isSensitiveToWater_2008591371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008591371L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDismountLocationForPassenger(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getDismountLocationForPassenger__1314458883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1314458883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSuffocating()Z", cancellable = true)
    private void isSuffocating_2008591371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008591371L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getControllingPassenger()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getControllingPassenger_1238074673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1238074673L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__678905064(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-678905064L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1270094343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1270094343L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_727666744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(727666744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction__1287500297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1287500297L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isOnFire()Z", cancellable = true)
    private void isOnFire_2008591371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008591371L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__707828666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-707828666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue__2110343537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110343537L))
            info.setReturnValue(4.375772E8F);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__726865926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-726865926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/monster/Strider;", cancellable = true)
    private void getBreedOffspring_1832960021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1832960021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot__1329286647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1329286647L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "boost()Z", cancellable = true)
    private void boost_2008591371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008591371L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkStriderSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkStriderSpawnRules_1128049094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1128049094L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setSuffocating(Z)V", cancellable = true)
    private void setSuffocating__1095037679(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1095037679L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__1226924979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1226924979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__590119376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590119376L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__475922570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-475922570L))
            info.setReturnValue(null);
    }


}
