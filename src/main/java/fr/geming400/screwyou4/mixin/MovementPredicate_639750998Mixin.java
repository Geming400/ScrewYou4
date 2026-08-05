package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.MovementPredicate.class)
public class MovementPredicate_639750998Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__268875271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-268875271L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1410174522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1410174522L))
            info.setReturnValue("2Wm[:p/ E?j)\u3D00?|u[9l8/po3)lMu\u9BAD^\uAC43D[xji5^'Fx6g@e^P_GrA\u0AA2wc");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1197103088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197103088L))
            info.setReturnValue(-603576792);
    }

    @Inject(at = @At("HEAD"), method = "matches(DDDD)Z", cancellable = true)
    private void matches__1250679239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250679239L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches_1990059931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990059931L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "x()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void x_1851708459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1851708459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void z_165528621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165528621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void y__1138865108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138865108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontalSpeed(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/entity/MovementPredicate;", cancellable = true)
    private static void horizontalSpeed__948236360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-948236360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontalSpeed()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void horizontalSpeed__1814071754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814071754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verticalSpeed(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/entity/MovementPredicate;", cancellable = true)
    private static void verticalSpeed_1669699494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669699494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verticalSpeed()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void verticalSpeed_723545636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723545636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallDistance()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void fallDistance_633876547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(633876547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallDistance(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/entity/MovementPredicate;", cancellable = true)
    private static void fallDistance_692904389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(692904389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "speed(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/entity/MovementPredicate;", cancellable = true)
    private static void speed__3320452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-3320452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "speed()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void speed__884876294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884876294L))
            info.setReturnValue(null);
    }


}
