package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.piglin.PiglinBrute.class)
public class PiglinBrute_1882427291Mixin {
        @Inject(at = @At("HEAD"), method = "canHunt()Z", cancellable = true)
    private void canHunt_1920705873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1920705873L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1432996959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432996959L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__819563148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-819563148L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1182208845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1182208845L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__563808068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-563808068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getArmPose()Lnet/minecraft/world/entity/monster/piglin/PiglinArmPose;", cancellable = true)
    private void getArmPose__868406352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-868406352L))
            info.setReturnValue(net.minecraft.world.entity.monster.piglin.PiglinArmPose.CROSSBOW_CHARGE);
    }

    @Inject(at = @At("HEAD"), method = "wantsToPickUp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void wantsToPickUp__133937977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-133937977L))
            info.setReturnValue(true);
    }


}
