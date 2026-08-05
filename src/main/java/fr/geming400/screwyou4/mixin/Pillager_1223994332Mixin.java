package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.illager.Pillager.class)
public class Pillager_1223994332Mixin {
        @Inject(at = @At("HEAD"), method = "getSlot(I)Lnet/minecraft/world/entity/SlotAccess;", cancellable = true)
    private void getSlot__669898853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669898853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getArmPose()Lnet/minecraft/world/entity/monster/illager/AbstractIllager$IllagerArmPose;", cancellable = true)
    private void getArmPose_870412417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870412417L))
            info.setReturnValue(net.minecraft.world.entity.monster.illager.AbstractIllager.IllagerArmPose.CROSSBOW_HOLD);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1222241027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1222241027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_523775886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523775886L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getInventory()Lnet/minecraft/world/SimpleContainer;", cancellable = true)
    private void getInventory_596966721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(596966721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isChargingCrossbow()Z", cancellable = true)
    private void isChargingCrossbow_1262272914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262272914L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setChargingCrossbow(Z)V", cancellable = true)
    private void setChargingCrossbow__1841356136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1841356136L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onCrossbowAttackPerformed()V", cancellable = true)
    private void onCrossbowAttackPerformed_1262269070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1262269070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxSpawnClusterSize()I", cancellable = true)
    private void getMaxSpawnClusterSize_1262256577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262256577L))
            info.setReturnValue(270957868);
    }

    @Inject(at = @At("HEAD"), method = "canUseNonMeleeWeapon(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canUseNonMeleeWeapon__1336437833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1336437833L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPreferredWeaponType()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void getPreferredWeaponType_2071328376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071328376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack__1664714796(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1664714796L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue_1438305302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1438305302L))
            info.setReturnValue(7.514183E8F);
    }

    @Inject(at = @At("HEAD"), method = "applyRaidBuffs(Lnet/minecraft/server/level/ServerLevel;IZ)V", cancellable = true)
    private void applyRaidBuffs__1832009008(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1832009008L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCelebrateSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getCelebrateSound__1980760067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980760067L))
            info.setReturnValue(null);
    }


}
