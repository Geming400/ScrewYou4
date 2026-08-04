package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.ZombieHorse.class)
public class ZombieHorse1311876841Mixin {
        @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_1350155424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350155424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_69230797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69230797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot__1987722594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1987722594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact__991024753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-991024753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1134358517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1134358517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_611658396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611658396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQuadLeashOffsets()[Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getQuadLeashOffsets_277711241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277711241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isMobControlled()Z", cancellable = true)
    private void isMobControlled_1350155424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350155424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__1248555323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1248555323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canAgeUp()Z", cancellable = true)
    private void canAgeUp_1350155424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350155424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chargeSpeedModifier()F", cancellable = true)
    private void chargeSpeedModifier_1350136204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350136204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1385430833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1385430833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1366264613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1366264613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway__1773787244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1773787244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canFallInLove()Z", cancellable = true)
    private void canFallInLove_1350155424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350155424L))
            info.setReturnValue(null);
    }


}
