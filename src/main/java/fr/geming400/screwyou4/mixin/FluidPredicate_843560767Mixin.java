package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.FluidPredicate.class)
public class FluidPredicate_843560767Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2065894271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2065894271L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__291899209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-291899209L))
            info.setReturnValue("`i䉵妌⍨4=P뢵$@gP'%.|fz$)鵡0_噌賎6-so");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_881823508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881823508L))
            info.setReturnValue(-695466186);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void matches__543682920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-543682920L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/Optional;", cancellable = true)
    private void properties_1089022188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1089022188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluids()Ljava/util/Optional;", cancellable = true)
    private void fluids_1089022188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1089022188L))
            info.setReturnValue(null);
    }


}
