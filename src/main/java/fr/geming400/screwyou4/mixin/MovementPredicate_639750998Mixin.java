package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.MovementPredicate.class)
public class MovementPredicate_639750998Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2025263256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2025263256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__495708978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-495708978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_678013739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(678013739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(DDDD)Z", cancellable = true)
    private void matches_1839662604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1839662604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1314440914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1314440914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void x__56716365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56716365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void z__56716365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56716365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void y__56716365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56716365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "speed()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void speed__56716365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56716365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "speed(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/entity/MovementPredicate;", cancellable = true)
    private static void speed_1599063349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599063349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verticalSpeed()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void verticalSpeed__56716365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56716365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verticalSpeed(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/entity/MovementPredicate;", cancellable = true)
    private static void verticalSpeed_1599063349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599063349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallDistance()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void fallDistance__56716365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56716365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallDistance(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/entity/MovementPredicate;", cancellable = true)
    private static void fallDistance_1599063349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599063349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontalSpeed()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void horizontalSpeed__56716365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56716365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontalSpeed(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/entity/MovementPredicate;", cancellable = true)
    private static void horizontalSpeed_1599063349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599063349L))
            info.setReturnValue(null);
    }


}
