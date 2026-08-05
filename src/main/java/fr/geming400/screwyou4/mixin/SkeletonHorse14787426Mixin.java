package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.SkeletonHorse.class)
public class SkeletonHorse14787426Mixin {
        @Inject(at = @At("HEAD"), method = "checkSkeletonHorseSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkSkeletonHorseSpawnRules__827476268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-827476268L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_53062165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(53062165L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot_1010155287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1010155287L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setTrap(Z)V", cancellable = true)
    private void setTrap_1244404255(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1244404255L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTrap()Z", cancellable = true)
    private void isTrap_53066009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53066009L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__685431019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-685431019L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1227858618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1227858618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canAgeUp()Z", cancellable = true)
    private void canAgeUp_53066009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53066009L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1612447048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612447048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract_1631613268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1631613268L))
            info.setReturnValue(null);
    }


}
