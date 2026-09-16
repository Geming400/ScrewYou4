package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.NameTagFeatureRenderer.Submit.class)
public class Submit477435580Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__431190688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-431190688L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1247859105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247859105L))
            info.setReturnValue("(m{ipx_$y>q4\u6800 sTEZ++^&\uD21BB$\u605Dio\u4E27HYK&>-V'V5(XitSlP6\">L{U*L}\uBB18$\u427D0n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1034787671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1034787671L))
            info.setReturnValue(679798580);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x__343774233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-343774233L))
            info.setReturnValue(5.156742E8F);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y__315145082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315145082L))
            info.setReturnValue(5.156742E8F);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_1714086687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1714086687L))
            info.setReturnValue(1873675940);
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text__423324612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-423324612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix4fc;", cancellable = true)
    private void pose__1247741589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1247741589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backgroundColor()I", cancellable = true)
    private void backgroundColor_1611068141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611068141L))
            info.setReturnValue(-1362686355);
    }

    @Inject(at = @At("HEAD"), method = "distanceToCameraSq()F", cancellable = true)
    private void distanceToCameraSq_1272902508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1272902508L))
            info.setReturnValue(5.156742E8F);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_285011826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285011826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightCoords()I", cancellable = true)
    private void lightCoords_1124873294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1124873294L))
            info.setReturnValue(-920397792);
    }

    @Inject(at = @At("HEAD"), method = "displayMode()Lnet/minecraft/client/gui/Font$DisplayMode;", cancellable = true)
    private void displayMode__1581979513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1581979513L))
            info.setReturnValue(net.minecraft.client.gui.Font.DisplayMode.POLYGON_OFFSET);
    }


}
