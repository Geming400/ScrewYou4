package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.ZombieHorse.class)
public class ZombieHorse1311876841Mixin {
        @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact_304626713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(304626713L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot_1387450313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387450313L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1607988465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1607988465L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed__636195273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-636195273L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1987879163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1987879163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canFallInLove()Z", cancellable = true)
    private void canFallInLove_1633770590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633770590L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isMobControlled()Z", cancellable = true)
    private void isMobControlled__1204935300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1204935300L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1451631981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1451631981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__973934927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-973934927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway_653347131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(653347131L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "chargeSpeedModifier()F", cancellable = true)
    private void chargeSpeedModifier_1167643106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1167643106L))
            info.setReturnValue(7.610365E8F);
    }

    @Inject(at = @At("HEAD"), method = "getQuadLeashOffsets()[Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getQuadLeashOffsets_1157101833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1157101833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canAgeUp()Z", cancellable = true)
    private void canAgeUp_1800356054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1800356054L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1287750429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1287750429L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_2061975150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2061975150L))
            info.setReturnValue(null);
    }


}
