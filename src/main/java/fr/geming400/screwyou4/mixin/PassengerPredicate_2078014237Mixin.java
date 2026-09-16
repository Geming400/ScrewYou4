package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.PassengerPredicate.class)
public class PassengerPredicate_2078014237Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1169387968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169387968L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1446529535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1446529535L))
            info.setReturnValue("\u621Cjcc\u7764k]\"? L\u61CBK\uCF08xlHR[-(+iV]\u5E41B9C.^,q@?'*\u0C24\u8CCC%+\uB425v\uD6D6QFn\u54CD{mc}[iq\uCBDDC\u23D2U%DF8e");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1659600969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1659600969L))
            info.setReturnValue(426354955);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__866644126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-866644126L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "passenger()Lnet/minecraft/advancements/predicates/entity/EntityPredicate;", cancellable = true)
    private void passenger_917591953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(917591953L))
            info.setReturnValue(null);
    }


}
