package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.VehiclePredicate.class)
public class VehiclePredicate1404406673Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1505048364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1505048364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_268946698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268946698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1442669415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442669415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__549785238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-549785238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vehicle()Lnet/minecraft/advancements/predicates/entity/EntityPredicate;", cancellable = true)
    private void vehicle__1080286740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1080286740L))
            info.setReturnValue(null);
    }


}
