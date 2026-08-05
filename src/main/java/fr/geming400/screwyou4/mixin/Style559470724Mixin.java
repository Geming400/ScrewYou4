package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.TextGizmo.Style.class)
public class Style559470724Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1944982983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944982983L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__575989251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-575989251L))
            info.setReturnValue("z:0{㡲H;V뾲P1ZAd@A&Un[A/&XI)!琍cn3u䁦벆XO=mG窮6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_597733466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597733466L))
            info.setReturnValue(-244733586);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale_597730087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597730087L))
            info.setReturnValue(6.891801E8F);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_597732970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597732970L))
            info.setReturnValue(-1642141592);
    }

    @Inject(at = @At("HEAD"), method = "withLeftAlignment(F)Lnet/minecraft/gizmos/TextGizmo$Style;", cancellable = true)
    private void withLeftAlignment_1525507620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1525507620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forColor(I)Lnet/minecraft/gizmos/TextGizmo$Style;", cancellable = true)
    private static void forColor_1897727609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897727609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adjustLeft()Ljava/util/OptionalDouble;", cancellable = true)
    private void adjustLeft_1196602593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1196602593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "whiteAndCentered()Lnet/minecraft/gizmos/TextGizmo$Style;", cancellable = true)
    private static void whiteAndCentered__1428693166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1428693166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forColorAndCentered(I)Lnet/minecraft/gizmos/TextGizmo$Style;", cancellable = true)
    private static void forColorAndCentered_1897727609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897727609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withScale(F)Lnet/minecraft/gizmos/TextGizmo$Style;", cancellable = true)
    private void withScale_1525507620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1525507620L))
            info.setReturnValue(null);
    }


}
