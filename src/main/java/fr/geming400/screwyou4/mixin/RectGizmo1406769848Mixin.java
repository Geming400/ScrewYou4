package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.RectGizmo.class)
public class RectGizmo1406769848Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1502685189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502685189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_271309873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271309873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1445032590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1445032590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "b()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void b__1790467919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790467919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "c()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void c__1790467919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790467919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "d()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void d__1790467919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790467919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "a()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void a__1790467919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790467919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/gizmos/GizmoStyle;", cancellable = true)
    private void style_2080848387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2080848387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emit(Lnet/minecraft/gizmos/GizmoPrimitives;F)V", cancellable = true)
    private void emit_2004210358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2004210358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromCuboidFace(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/core/Direction;Lnet/minecraft/gizmos/GizmoStyle;)Lnet/minecraft/gizmos/RectGizmo;", cancellable = true)
    private static void fromCuboidFace__475645448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-475645448L))
            info.setReturnValue(null);
    }


}
