package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.DistanceTrigger.TriggerInstance.class)
public class TriggerInstance1731660310Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_823034042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(823034042L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1792883461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1792883461L))
            info.setReturnValue("C\u4203dw5'\u3E17D6E[d;1\uC390r/Oy:':)GoNL\uAC19,7Hw!eYsUffhSoMaRiWrZO@n0\u48ADly0aazUeO\uC640V");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2005954895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005954895L))
            info.setReturnValue(-1229507379);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__329570997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-329570997L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "distance()Ljava/util/Optional;", cancellable = true)
    private void distance_1226937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1226937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "travelledThroughNether(Lnet/minecraft/advancements/predicates/DistancePredicate;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void travelledThroughNether_1718047433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1718047433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallFromHeight(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;Lnet/minecraft/advancements/predicates/DistancePredicate;Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void fallFromHeight_1834915487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1834915487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rideEntityInLava(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;Lnet/minecraft/advancements/predicates/DistancePredicate;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void rideEntityInLava_1945575672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945575672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startPosition()Ljava/util/Optional;", cancellable = true)
    private void startPosition_1194666607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1194666607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_501007269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(501007269L))
            info.setReturnValue(null);
    }


}
