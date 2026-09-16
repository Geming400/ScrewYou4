package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.TextGizmo.Style.class)
public class Style559470724Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__349155544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-349155544L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1329894249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329894249L))
            info.setReturnValue("*) I/@S4:\u5E2Fq\u443BGyI#}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1116822815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116822815L))
            info.setReturnValue(997038473);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale__1864247267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1864247267L))
            info.setReturnValue(9.521952E8F);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_1796121831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1796121831L))
            info.setReturnValue(-1953229610);
    }

    @Inject(at = @At("HEAD"), method = "withLeftAlignment(F)Lnet/minecraft/gizmos/TextGizmo$Style;", cancellable = true)
    private void withLeftAlignment_215682542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(215682542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forColor(I)Lnet/minecraft/gizmos/TextGizmo$Style;", cancellable = true)
    private static void forColor_365589023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(365589023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adjustLeft()Ljava/util/OptionalDouble;", cancellable = true)
    private void adjustLeft_1892736663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1892736663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withScale(F)Lnet/minecraft/gizmos/TextGizmo$Style;", cancellable = true)
    private void withScale_1137034112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137034112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "whiteAndCentered()Lnet/minecraft/gizmos/TextGizmo$Style;", cancellable = true)
    private static void whiteAndCentered__2037689452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2037689452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forColorAndCentered(I)Lnet/minecraft/gizmos/TextGizmo$Style;", cancellable = true)
    private static void forColorAndCentered__1662216280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1662216280L))
            info.setReturnValue(null);
    }


}
