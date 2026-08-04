package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.zombie.Drowned.class)
public class Drowned32736009Mixin {
        @Inject(at = @At("HEAD"), method = "isVisuallySwimming()Z", cancellable = true)
    private void isVisuallySwimming_71014592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(71014592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateSwimming()V", cancellable = true)
    private void updateSwimming_71010748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(71010748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPushedByFluid()Z", cancellable = true)
    private void isPushedByFluid_71014592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(71014592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1209910035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1209910035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rideTick()V", cancellable = true)
    private void rideTick_71010748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(71010748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1881467947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881467947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__667482436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-667482436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "okTarget(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void okTarget_354403184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354403184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction_1069890220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069890220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSearchingForLand(Z)V", cancellable = true)
    private void setSearchingForLand_1262352838(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1262352838L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSearchingForLand()Z", cancellable = true)
    private void isSearchingForLand_71014592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(71014592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wantsToSwim()Z", cancellable = true)
    private void wantsToSwim_71014592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(71014592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wantsToPickUp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void wantsToPickUp__1983629258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1983629258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPreferredWeaponType()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void getPreferredWeaponType_880070054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(880070054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkDrownedSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkDrownedSpawnRules__1752641058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1752641058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack_1438994178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1438994178L))
            info.cancel();
    }


}
