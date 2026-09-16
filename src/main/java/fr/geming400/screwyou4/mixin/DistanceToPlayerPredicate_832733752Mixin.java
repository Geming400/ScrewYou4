package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.DistanceToPlayerPredicate.class)
public class DistanceToPlayerPredicate_832733752Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__75892517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-75892517L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1603157276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1603157276L))
            info.setReturnValue("N");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1390085842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390085842L))
            info.setReturnValue(1154913170);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__2111924611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2111924611L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "distance()Lnet/minecraft/advancements/predicates/DistancePredicate;", cancellable = true)
    private void distance__446374513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-446374513L))
            info.setReturnValue(null);
    }


}
