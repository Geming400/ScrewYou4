package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.VehiclePredicate.class)
public class VehiclePredicate1404406673Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_495780405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(495780405L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2120137098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2120137098L))
            info.setReturnValue("91\u4E5FZtdJ<]*i7\u4005!\u198A[\u66A4\u2282O\uA0535G/t5xBorz/3s- \u6310gVV\u2912F(Uf7^y1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1961758764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1961758764L))
            info.setReturnValue(1273131681);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1540251689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1540251689L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "vehicle()Lnet/minecraft/advancements/predicates/entity/EntityPredicate;", cancellable = true)
    private void vehicle__2002700776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2002700776L))
            info.setReturnValue(null);
    }


}
