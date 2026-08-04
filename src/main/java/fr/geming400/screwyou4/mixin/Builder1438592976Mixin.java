package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.FluidPredicate.Builder.class)
public class Builder1438592976Mixin {
        @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/advancements/predicates/FluidPredicate$Builder;", cancellable = true)
    private void of__204705350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-204705350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/material/Fluid;)Lnet/minecraft/advancements/predicates/FluidPredicate$Builder;", cancellable = true)
    private void of_1823218494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823218494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setProperties(Lnet/minecraft/advancements/predicates/StatePropertiesPredicate;)Lnet/minecraft/advancements/predicates/FluidPredicate$Builder;", cancellable = true)
    private void setProperties__362927010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-362927010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/FluidPredicate;", cancellable = true)
    private void build_1076461990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1076461990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluid()Lnet/minecraft/advancements/predicates/FluidPredicate$Builder;", cancellable = true)
    private static void fluid__854492313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-854492313L))
            info.setReturnValue(null);
    }


}
