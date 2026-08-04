package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityFlagsPredicate.Builder.class)
public class Builder1544105576Mixin {
        @Inject(at = @At("HEAD"), method = "flags()Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private static void flags_1192901977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192901977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate;", cancellable = true)
    private void build__1875886696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1875886696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIsBaby(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setIsBaby_679217700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679217700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOnFire(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setOnFire_679217700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679217700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSprinting(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setSprinting_679217700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679217700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIsFallFlying(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setIsFallFlying_679217700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679217700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSwimming(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setSwimming_679217700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679217700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIsInWater(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setIsInWater_679217700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679217700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOnGround(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setOnGround_679217700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679217700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCrouching(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setCrouching_679217700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679217700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIsFlying(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setIsFlying_679217700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679217700L))
            info.setReturnValue(null);
    }


}
