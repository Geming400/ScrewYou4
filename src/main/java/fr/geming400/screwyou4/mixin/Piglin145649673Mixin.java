package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.piglin.Piglin.class)
public class Piglin145649673Mixin {
        @Inject(at = @At("HEAD"), method = "getSlot(I)Lnet/minecraft/world/entity/SlotAccess;", cancellable = true)
    private void getSlot__1359585219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1359585219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__669638180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669638180L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__40252253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-40252253L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "isBaby()Z", cancellable = true)
    private void isBaby_2119522464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2119522464L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1520751663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1520751663L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "startRiding(Lnet/minecraft/world/entity/Entity;ZZ)Z", cancellable = true)
    private void startRiding_247421584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(247421584L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getInventory()Lnet/minecraft/world/SimpleContainer;", cancellable = true)
    private void getInventory__147527287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-147527287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1140860965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1140860965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_852384021(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(852384021L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__2140162095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2140162095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPreferredWeaponType()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void getPreferredWeaponType__1563240731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1563240731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway__512880037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-512880037L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "wantsToPickUp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void wantsToPickUp_790429180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(790429180L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canUseNonMeleeWeapon(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canUseNonMeleeWeapon_1314023947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1314023947L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setBaby(Z)V", cancellable = true)
    private void setBaby__445744866(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-445744866L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack_1528583186(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1528583186L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDancing()Z", cancellable = true)
    private void isDancing__1649190310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1649190310L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setDancing(Z)V", cancellable = true)
    private void setDancing__439520972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-439520972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getArmPose()Lnet/minecraft/world/entity/monster/piglin/PiglinArmPose;", cancellable = true)
    private void getArmPose_1562121896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1562121896L))
            info.setReturnValue(net.minecraft.world.entity.monster.piglin.PiglinArmPose.DEFAULT);
    }

    @Inject(at = @At("HEAD"), method = "setChargingCrossbow(Z)V", cancellable = true)
    private void setChargingCrossbow_1500167331(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1500167331L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onCrossbowAttackPerformed()V", cancellable = true)
    private void onCrossbowAttackPerformed_812876173(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(812876173L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkPiglinSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkPiglinSpawnRules__1309215148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1309215148L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_895747982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(895747982L))
            info.setReturnValue(null);
    }


}
