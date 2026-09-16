package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.LevitationTrigger.TriggerInstance.class)
public class TriggerInstance_1471259746Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_562633477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562633477L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2053284026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2053284026L))
            info.setReturnValue("&nObg91kmI}?u\u87FCyerK\u5E72\uB631Gy\u331B\u987E>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2028611836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2028611836L))
            info.setReturnValue(1293043860);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/phys/Vec3;I)Z", cancellable = true)
    private void matches_1230712392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1230712392L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "duration()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void duration__2020256421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2020256421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distance()Ljava/util/Optional;", cancellable = true)
    private void distance__259173628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-259173628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_240606704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240606704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levitated(Lnet/minecraft/advancements/predicates/DistancePredicate;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void levitated_450950626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(450950626L))
            info.setReturnValue(null);
    }


}
