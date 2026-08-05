package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.DistanceToPlayerPredicate.class)
public class DistanceToPlayerPredicate_832733752Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2076721286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2076721286L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__302726224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302726224L))
            info.setReturnValue("2흯Q䬤gp@ٹSr$@2IvGO[aP]hC皂qzY [s졷`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_870996493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870996493L))
            info.setReturnValue(1964805452);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1121458160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1121458160L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "distance()Lnet/minecraft/advancements/predicates/DistancePredicate;", cancellable = true)
    private void distance_848934244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(848934244L))
            info.setReturnValue(null);
    }


}
