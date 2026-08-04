package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.PositionMoveRotation.class)
public class PositionMoveRotation2096583124Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__812871913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-812871913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_961123149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(961123149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2134845866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134845866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/entity/PositionMoveRotation;", cancellable = true)
    private static void of_675964342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(675964342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/portal/TeleportTransition;)Lnet/minecraft/world/entity/PositionMoveRotation;", cancellable = true)
    private static void of__1951844595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1951844595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position__1100654643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1100654643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculateAbsolute(Lnet/minecraft/world/entity/PositionMoveRotation;Lnet/minecraft/world/entity/PositionMoveRotation;Ljava/util/Set;)Lnet/minecraft/world/entity/PositionMoveRotation;", cancellable = true)
    private static void calculateAbsolute_674249554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674249554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withRotation(FF)Lnet/minecraft/world/entity/PositionMoveRotation;", cancellable = true)
    private void withRotation_1203791269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1203791269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deltaMovement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void deltaMovement__1100654643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1100654643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot_2134842487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134842487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot_2134842487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134842487L))
            info.setReturnValue(null);
    }


}
