package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.RectGizmo.class)
public class RectGizmo1406769848Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_498143580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498143580L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2117773923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2117773923L))
            info.setReturnValue("5g\u393BqHTg\u368AJET\u90A6dM}Zx\u8B31r=2v\u779Cq5dt)Is\u5B90VIFRIlE{u\u4385S\uCD91u}]-]1-yZ\u5B74");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1964121939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964121939L))
            info.setReturnValue(-1429126843);
    }

    @Inject(at = @At("HEAD"), method = "b()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void b_360396047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360396047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "c()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void c__1984270994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1984270994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "d()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void d__33970739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-33970739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "a()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void a__1589904208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1589904208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/gizmos/GizmoStyle;", cancellable = true)
    private void style__432503054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-432503054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emit(Lnet/minecraft/gizmos/GizmoPrimitives;F)V", cancellable = true)
    private void emit_1816867337(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1816867337L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromCuboidFace(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/core/Direction;Lnet/minecraft/gizmos/GizmoStyle;)Lnet/minecraft/gizmos/RectGizmo;", cancellable = true)
    private static void fromCuboidFace__1004845129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1004845129L))
            info.setReturnValue(null);
    }


}
