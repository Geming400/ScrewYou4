package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.FluidPredicate.Builder.class)
public class Builder1438592976Mixin {
        @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/advancements/predicates/FluidPredicate$Builder;", cancellable = true)
    private void of_1414343569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1414343569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/material/Fluid;)Lnet/minecraft/advancements/predicates/FluidPredicate$Builder;", cancellable = true)
    private void of_216648341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216648341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setProperties(Lnet/minecraft/advancements/predicates/StatePropertiesPredicate;)Lnet/minecraft/advancements/predicates/FluidPredicate$Builder;", cancellable = true)
    private void setProperties__1067157933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1067157933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/FluidPredicate;", cancellable = true)
    private void build__931151212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-931151212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluid()Lnet/minecraft/advancements/predicates/FluidPredicate$Builder;", cancellable = true)
    private static void fluid__1709499727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1709499727L))
            info.setReturnValue(null);
    }


}
