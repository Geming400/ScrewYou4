package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.PositionMoveRotation.class)
public class PositionMoveRotation2096583124Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1187956856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1187956856L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1427960647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427960647L))
            info.setReturnValue("R}jA\u313E\u685DRx\uA197zt  {nNMo!\uCD64$Y`I");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1641032081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1641032081L))
            info.setReturnValue(-831959287);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/portal/TeleportTransition;)Lnet/minecraft/world/entity/PositionMoveRotation;", cancellable = true)
    private static void of__1654075356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654075356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/entity/PositionMoveRotation;", cancellable = true)
    private static void of_1121052301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121052301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position__1620826620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620826620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withRotation(FF)Lnet/minecraft/world/entity/PositionMoveRotation;", cancellable = true)
    private void withRotation__834009407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-834009407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculateAbsolute(Lnet/minecraft/world/entity/PositionMoveRotation;Lnet/minecraft/world/entity/PositionMoveRotation;Ljava/util/Set;)Lnet/minecraft/world/entity/PositionMoveRotation;", cancellable = true)
    private static void calculateAbsolute__1270156145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1270156145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deltaMovement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void deltaMovement_1234250214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234250214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot__1887581031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1887581031L))
            info.setReturnValue(3.198405E8F);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot__80126568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-80126568L))
            info.setReturnValue(3.198405E8F);
    }


}
