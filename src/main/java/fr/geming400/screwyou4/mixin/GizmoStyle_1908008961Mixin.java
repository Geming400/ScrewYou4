package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.GizmoStyle.class)
public class GizmoStyle_1908008961Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_999382692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999382692L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1616534811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616534811L))
            info.setReturnValue("Qv!Qd\u4343{$O\u087E,v+9V\u4FADm!r3_(P\u9C760Q(7sGp&Tj\uB8F8yd@>,e$=\u5DDD5G9\u72BCvcj7emr\u728ErdL+jp-\u3FA9_X[zi;c%)i7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1829606245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1829606245L))
            info.setReturnValue(1110756194);
    }

    @Inject(at = @At("HEAD"), method = "fill()I", cancellable = true)
    private void fill_739099203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(739099203L))
            info.setReturnValue(962163077);
    }

    @Inject(at = @At("HEAD"), method = "fill(I)Lnet/minecraft/gizmos/GizmoStyle;", cancellable = true)
    private static void fill__2071920641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2071920641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "strokeWidth()F", cancellable = true)
    private void strokeWidth__2016797451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2016797451L))
            info.setReturnValue(8.0184E7F);
    }

    @Inject(at = @At("HEAD"), method = "multipliedFill(F)I", cancellable = true)
    private void multipliedFill__1207372494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1207372494L))
            info.setReturnValue(-21006121);
    }

    @Inject(at = @At("HEAD"), method = "multipliedStroke(F)I", cancellable = true)
    private void multipliedStroke_891887975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891887975L))
            info.setReturnValue(423673856);
    }

    @Inject(at = @At("HEAD"), method = "strokeAndFill(IFI)Lnet/minecraft/gizmos/GizmoStyle;", cancellable = true)
    private static void strokeAndFill_259935329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259935329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stroke()I", cancellable = true)
    private void stroke__508204370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508204370L))
            info.setReturnValue(-1515401700);
    }

    @Inject(at = @At("HEAD"), method = "stroke(I)Lnet/minecraft/gizmos/GizmoStyle;", cancellable = true)
    private static void stroke__994750220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-994750220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stroke(IF)Lnet/minecraft/gizmos/GizmoStyle;", cancellable = true)
    private static void stroke_1264981928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1264981928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasFill()Z", cancellable = true)
    private void hasFill__347022182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-347022182L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasStroke()Z", cancellable = true)
    private void hasStroke__609485947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609485947L))
            info.setReturnValue(true);
    }


}
