package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.FallAfterExplosionTrigger.TriggerInstance.class)
public class TriggerInstance_853616009Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__55010260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-55010260L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1624039533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1624039533L))
            info.setReturnValue("_?S0g)V\u9BB2%nc?KeFvf;:'&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1410968099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1410968099L))
            info.setReturnValue(1586389667);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches_1516939932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1516939932L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "cause()Ljava/util/Optional;", cancellable = true)
    private void cause__1470685025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1470685025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_1113789114(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1113789114L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "distance()Ljava/util/Optional;", cancellable = true)
    private void distance__876817365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-876817365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__377037033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377037033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallAfterExplosion(Lnet/minecraft/advancements/predicates/DistancePredicate;Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void fallAfterExplosion__781130872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-781130872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startPosition()Ljava/util/Optional;", cancellable = true)
    private void startPosition_316622305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(316622305L))
            info.setReturnValue(null);
    }


}
