package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.SkeletonHorse.class)
public class SkeletonHorse14787426Mixin {
        @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1646084993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1646084993L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot_90360898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90360898L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1389889416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1389889416L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1009998718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009998718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_154542566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(154542566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract_2023942954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023942954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canAgeUp()Z", cancellable = true)
    private void canAgeUp_503266639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(503266639L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isTrap()Z", cancellable = true)
    private void isTrap__2062910462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2062910462L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setTrap(Z)V", cancellable = true)
    private void setTrap__1621246578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1621246578L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkSkeletonHorseSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkSkeletonHorseSpawnRules_739985296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(739985296L))
            info.setReturnValue(false);
    }


}
