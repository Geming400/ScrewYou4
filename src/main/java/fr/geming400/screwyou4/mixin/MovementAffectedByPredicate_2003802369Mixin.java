package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.MovementAffectedByPredicate.class)
public class MovementAffectedByPredicate_2003802369Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__905652669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-905652669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_868342393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868342393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2042065110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042065110L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches_49610457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(49610457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/advancements/predicates/LocationPredicate;", cancellable = true)
    private void predicate_927285229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(927285229L))
            info.setReturnValue(null);
    }


}
