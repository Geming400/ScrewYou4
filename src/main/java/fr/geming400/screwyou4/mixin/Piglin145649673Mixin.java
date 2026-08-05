package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.piglin.Piglin.class)
public class Piglin145649673Mixin {
        @Inject(at = @At("HEAD"), method = "getSlot(I)Lnet/minecraft/world/entity/SlotAccess;", cancellable = true)
    private void getSlot__1748243511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1748243511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getArmPose()Lnet/minecraft/world/entity/monster/piglin/PiglinArmPose;", cancellable = true)
    private void getArmPose_1689783327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1689783327L))
            info.setReturnValue(net.minecraft.world.entity.monster.piglin.PiglinArmPose.DEFAULT);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__303780658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-303780658L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setDancing(Z)V", cancellable = true)
    private void setDancing_1375266502(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1375266502L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDancing()Z", cancellable = true)
    private void isDancing_183928256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183928256L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBaby()Z", cancellable = true)
    private void isBaby_183928256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183928256L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_1738626531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1738626531L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1994381611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994381611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startRiding(Lnet/minecraft/world/entity/Entity;ZZ)Z", cancellable = true)
    private void startRiding_1209149593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1209149593L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1791399117(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1791399117L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__554568772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-554568772L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getInventory()Lnet/minecraft/world/SimpleContainer;", cancellable = true)
    private void getInventory__481377937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-481377937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1096996371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096996371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setChargingCrossbow(Z)V", cancellable = true)
    private void setChargingCrossbow_1375266502(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1375266502L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onCrossbowAttackPerformed()V", cancellable = true)
    private void onCrossbowAttackPerformed_183924412(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(183924412L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkPiglinSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkPiglinSpawnRules__696614021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-696614021L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canUseNonMeleeWeapon(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canUseNonMeleeWeapon_1880184805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1880184805L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "wantsToPickUp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void wantsToPickUp__1870715594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1870715594L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPreferredWeaponType()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void getPreferredWeaponType_992983718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(992983718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway_1354952884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1354952884L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack_1551907842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1551907842L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBaby(Z)V", cancellable = true)
    private void setBaby_1375266502(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1375266502L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract_1762475515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762475515L))
            info.setReturnValue(null);
    }


}
