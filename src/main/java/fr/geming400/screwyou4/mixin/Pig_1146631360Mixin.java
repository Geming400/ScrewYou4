package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.pig.Pig.class)
public class Pig_1146631360Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__1481628704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1481628704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getVariant__1319496052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1319496052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1853365707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1853365707L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1773233947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1773233947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_2141842651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2141842651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getControllingPassenger()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getControllingPassenger_2035718975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2035718975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thunderHit(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LightningBolt;)V", cancellable = true)
    private void thunderHit_245558559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(245558559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__1608152994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1608152994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot_1222204831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1222204831L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1139180409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1139180409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1286515459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286515459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/pig/Pig;", cancellable = true)
    private void getBreedOffspring_2126343824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126343824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1122504947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1122504947L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "boost()Z", cancellable = true)
    private void boost__1469385549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1469385549L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1896729668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896729668L))
            info.setReturnValue(null);
    }


}
