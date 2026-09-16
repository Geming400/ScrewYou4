package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityFlagsPredicate.Builder.class)
public class Builder1544105576Mixin {
        @Inject(at = @At("HEAD"), method = "flags()Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private static void flags_1434142706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1434142706L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityFlagsPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate;", cancellable = true)
    private void build_842231658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(842231658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSprinting(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setSprinting_1866686954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866686954L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityFlagsPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setOnGround(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setOnGround__914790676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-914790676L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityFlagsPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setSwimming(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setSwimming_1822018499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822018499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIsFlying(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setIsFlying__1877369281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1877369281L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityFlagsPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setCrouching(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setCrouching__471813558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-471813558L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityFlagsPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setIsInWater(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setIsInWater_797049034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797049034L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityFlagsPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setIsFallFlying(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setIsFallFlying_390276314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(390276314L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityFlagsPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setIsBaby(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setIsBaby_1746315718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1746315718L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityFlagsPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setOnFire(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;", cancellable = true)
    private void setOnFire_462810139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(462810139L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityFlagsPredicate.Builder());
    }


}
