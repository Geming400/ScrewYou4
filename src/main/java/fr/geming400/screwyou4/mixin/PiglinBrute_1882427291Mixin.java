package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.piglin.PiglinBrute.class)
public class PiglinBrute_1882427291Mixin {
        @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1067139437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067139437L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1037438016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1037438016L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_1696525364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1696525364L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "canHunt()Z", cancellable = true)
    private void canHunt_2087536558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087536558L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "wantsToPickUp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void wantsToPickUp__1767760499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1767760499L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1662441697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1662441697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getArmPose()Lnet/minecraft/world/entity/monster/piglin/PiglinArmPose;", cancellable = true)
    private void getArmPose__996067783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-996067783L))
            info.setReturnValue(net.minecraft.world.entity.monster.piglin.PiglinArmPose.ATTACKING_WITH_MELEE_WEAPON);
    }


}
