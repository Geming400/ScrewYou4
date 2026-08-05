package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.PointGizmo.class)
public class PointGizmo640254130Mixin {
        @Inject(at = @At("HEAD"), method = "size()F", cancellable = true)
    private void size_1083982836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1083982836L))
            info.setReturnValue(9.678077E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__268372138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-268372138L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1410677655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1410677655L))
            info.setReturnValue("7\uFDC6H\u9865\uC294&q[;A\u562C^\u097A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1197606221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197606221L))
            info.setReturnValue(743929401);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void pos__1176038441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176038441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_1876905237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1876905237L))
            info.setReturnValue(-587426687);
    }

    @Inject(at = @At("HEAD"), method = "emit(Lnet/minecraft/gizmos/GizmoPrimitives;F)V", cancellable = true)
    private void emit_1050351619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1050351619L))
            info.cancel();
    }


}
