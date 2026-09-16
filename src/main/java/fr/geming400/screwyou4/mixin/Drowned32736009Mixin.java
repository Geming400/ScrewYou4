package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.zombie.Drowned.class)
public class Drowned32736009Mixin {
        @Inject(at = @At("HEAD"), method = "rideTick()V", cancellable = true)
    private void rideTick_1513095207(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1513095207L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateSwimming()V", cancellable = true)
    private void updateSwimming__171286858(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-171286858L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isVisuallySwimming()Z", cancellable = true)
    private void isVisuallySwimming__532903636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532903636L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1407837999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407837999L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "isPushedByFluid()Z", cancellable = true)
    private void isPushedByFluid_1569573776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1569573776L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1027947301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027947301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPreferredWeaponType()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void getPreferredWeaponType__1676154395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1676154395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wantsToPickUp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void wantsToPickUp_677515516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(677515516L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction_864218489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(864218489L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack_1415669522(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1415669522L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "okTarget(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void okTarget__2020545731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2020545731L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_782834318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782834318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wantsToSwim()Z", cancellable = true)
    private void wantsToSwim_265482906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(265482906L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isSearchingForLand()Z", cancellable = true)
    private void isSearchingForLand__1137105348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1137105348L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkDrownedSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkDrownedSpawnRules__1159590093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1159590093L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setSearchingForLand(Z)V", cancellable = true)
    private void setSearchingForLand_1322258690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1322258690L))
            info.cancel();
    }


}
