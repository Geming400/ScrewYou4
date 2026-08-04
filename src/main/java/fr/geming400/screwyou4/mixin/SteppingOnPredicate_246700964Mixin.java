package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.SteppingOnPredicate.class)
public class SteppingOnPredicate_246700964Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1632213222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632213222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__888759012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-888759012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_284963705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(284963705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1707490948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707490948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/advancements/predicates/LocationPredicate;", cancellable = true)
    private void predicate__829816176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-829816176L))
            info.setReturnValue(null);
    }


}
