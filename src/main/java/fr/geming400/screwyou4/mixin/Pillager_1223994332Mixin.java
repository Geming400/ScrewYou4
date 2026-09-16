package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.illager.Pillager.class)
public class Pillager_1223994332Mixin {
        @Inject(at = @At("HEAD"), method = "getSlot(I)Lnet/minecraft/world/entity/SlotAccess;", cancellable = true)
    private void getSlot__281240561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-281240561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1695870975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1695870975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInventory()Lnet/minecraft/world/SimpleContainer;", cancellable = true)
    private void getInventory_930817371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(930817371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue__316991851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-316991851L))
            info.setReturnValue(2.889013E8F);
    }

    @Inject(at = @At("HEAD"), method = "getPreferredWeaponType()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void getPreferredWeaponType__484896073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-484896073L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canUseNonMeleeWeapon(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canUseNonMeleeWeapon__1902598691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1902598691L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMaxSpawnClusterSize()I", cancellable = true)
    private void getMaxSpawnClusterSize_976307603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(976307603L))
            info.setReturnValue(-1009168751);
    }

    @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack__1688039452(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1688039452L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getArmPose()Lnet/minecraft/world/entity/monster/illager/AbstractIllager$IllagerArmPose;", cancellable = true)
    private void getArmPose_323308234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(323308234L))
            info.setReturnValue(net.minecraft.world.entity.monster.illager.AbstractIllager.IllagerArmPose.SPELLCASTING);
    }

    @Inject(at = @At("HEAD"), method = "isChargingCrossbow()Z", cancellable = true)
    private void isChargingCrossbow__1190676403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1190676403L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setChargingCrossbow(Z)V", cancellable = true)
    private void setChargingCrossbow__1716455307(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1716455307L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onCrossbowAttackPerformed()V", cancellable = true)
    private void onCrossbowAttackPerformed_1891220831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1891220831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1974092640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1974092640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyRaidBuffs(Lnet/minecraft/server/level/ServerLevel;IZ)V", cancellable = true)
    private void applyRaidBuffs_251522184(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(251522184L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCelebrateSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getCelebrateSound__1457565633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457565633L))
            info.setReturnValue(null);
    }


}
