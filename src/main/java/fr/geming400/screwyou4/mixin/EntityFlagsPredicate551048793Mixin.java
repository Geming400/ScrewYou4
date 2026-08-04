package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityFlagsPredicate.class)
public class EntityFlagsPredicate551048793Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1936561052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1936561052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__584411182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-584411182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_589311535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(589311535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void matches_99327977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(99327977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1403143118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1403143118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSprinting()Ljava/util/Optional;", cancellable = true)
    private void isSprinting_796510215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796510215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCrouching()Ljava/util/Optional;", cancellable = true)
    private void isCrouching_796510215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796510215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFallFlying()Ljava/util/Optional;", cancellable = true)
    private void isFallFlying_796510215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796510215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOnGround()Ljava/util/Optional;", cancellable = true)
    private void isOnGround_796510215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796510215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOnFire()Ljava/util/Optional;", cancellable = true)
    private void isOnFire_796510215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796510215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSwimming()Ljava/util/Optional;", cancellable = true)
    private void isSwimming_796510215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796510215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBaby()Ljava/util/Optional;", cancellable = true)
    private void isBaby_796510215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796510215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFlying()Ljava/util/Optional;", cancellable = true)
    private void isFlying_796510215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796510215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInWater()Ljava/util/Optional;", cancellable = true)
    private void isInWater_796510215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796510215L))
            info.setReturnValue(null);
    }


}
