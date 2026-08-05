package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.PassengerPredicate.class)
public class PassengerPredicate_2078014237Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__831440801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831440801L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_942554261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(942554261L))
            info.setReturnValue("<0/a$Em@O啳w2YKAvFr/U?瘰?zci埼뇈lpO윿?vO4{zi&LS?L㟵孯'ᏜoS큒7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2116276978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116276978L))
            info.setReturnValue(948884948);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches_123822325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(123822325L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "passenger()Lnet/minecraft/advancements/predicates/entity/EntityPredicate;", cancellable = true)
    private void passenger__406679177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-406679177L))
            info.setReturnValue(null);
    }


}
