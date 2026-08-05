package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.CircleGizmo.class)
public class CircleGizmo1441315596Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1468139441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1468139441L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_305855621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305855621L))
            info.setReturnValue("TMP{0?UQ\u4CE5)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1479578338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479578338L))
            info.setReturnValue(-260539578);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void pos__1755922171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1755922171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/gizmos/GizmoStyle;", cancellable = true)
    private void style_2115394135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2115394135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emit(Lnet/minecraft/gizmos/GizmoPrimitives;F)V", cancellable = true)
    private void emit_2038756106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2038756106L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "radius()F", cancellable = true)
    private void radius_1479574959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479574959L))
            info.setReturnValue(8.027855E8F);
    }


}
