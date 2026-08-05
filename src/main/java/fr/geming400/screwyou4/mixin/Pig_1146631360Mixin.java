package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.pig.Pig.class)
public class Pig_1146631360Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_983538954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(983538954L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getVariant__1599460165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1599460165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getControllingPassenger()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getControllingPassenger_414393244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(414393244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1502586493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1502586493L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_446412914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446412914L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__96014685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96014685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thunderHit(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LightningBolt;)V", cancellable = true)
    private void thunderHit_216611342(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(216611342L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1531510095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1531510095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1550547355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1550547355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/pig/Pig;", cancellable = true)
    private void getBreedOffspring__291321614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-291321614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot_2141999220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2141999220L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "boost()Z", cancellable = true)
    private void boost_1184909942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184909942L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__2050606408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2050606408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__1413800805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1413800805L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1299603999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1299603999L))
            info.setReturnValue(null);
    }


}
