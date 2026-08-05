package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.GizmoStyle.class)
public class GizmoStyle_1908008961Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1001446077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1001446077L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_772548985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(772548985L))
            info.setReturnValue("(p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1946271702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946271702L))
            info.setReturnValue(1703384353);
    }

    @Inject(at = @At("HEAD"), method = "fill()I", cancellable = true)
    private void fill_1946271206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946271206L))
            info.setReturnValue(1881907842);
    }

    @Inject(at = @At("HEAD"), method = "fill(I)Lnet/minecraft/gizmos/GizmoStyle;", cancellable = true)
    private static void fill_1467106492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467106492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "strokeAndFill(IFI)Lnet/minecraft/gizmos/GizmoStyle;", cancellable = true)
    private static void strokeAndFill__1391148097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1391148097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multipliedStroke(F)I", cancellable = true)
    private void multipliedStroke__1175824420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1175824420L))
            info.setReturnValue(1529666490);
    }

    @Inject(at = @At("HEAD"), method = "multipliedFill(F)I", cancellable = true)
    private void multipliedFill__1175824420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1175824420L))
            info.setReturnValue(1529666490);
    }

    @Inject(at = @At("HEAD"), method = "strokeWidth()F", cancellable = true)
    private void strokeWidth_1946268323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946268323L))
            info.setReturnValue(6.086116E8F);
    }

    @Inject(at = @At("HEAD"), method = "hasStroke()Z", cancellable = true)
    private void hasStroke_1946287543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946287543L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasFill()Z", cancellable = true)
    private void hasFill_1946287543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946287543L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "stroke(IF)Lnet/minecraft/gizmos/GizmoStyle;", cancellable = true)
    private static void stroke_273128672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(273128672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stroke(I)Lnet/minecraft/gizmos/GizmoStyle;", cancellable = true)
    private static void stroke_1467106492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467106492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stroke()I", cancellable = true)
    private void stroke_1946271206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946271206L))
            info.setReturnValue(1881907842);
    }


}
