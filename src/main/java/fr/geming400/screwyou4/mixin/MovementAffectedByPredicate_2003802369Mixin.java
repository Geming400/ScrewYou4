package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.MovementAffectedByPredicate.class)
public class MovementAffectedByPredicate_2003802369Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1095176100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095176100L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1520741403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520741403L))
            info.setReturnValue("d\u62F6CWz%5=\u3F1C-#VEi7>hWT2B+X\u7ECDNiQvD!\"I \";su3CWuFg[Zu");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1733812837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1733812837L))
            info.setReturnValue(2133515842);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__940855994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-940855994L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/advancements/predicates/LocationPredicate;", cancellable = true)
    private void predicate_2041643414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041643414L))
            info.setReturnValue(null);
    }


}
