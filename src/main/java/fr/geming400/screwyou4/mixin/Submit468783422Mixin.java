package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.TextFeatureRenderer.Submit.class)
public class Submit468783422Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__439842846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-439842846L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1239206947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1239206947L))
            info.setReturnValue("G#ur^H\u4D2C\u90C2j\"4N (8Q\uA20A!fZ'tu>[4bY\uD1014Z\"\u2F0B\u5773n\u5730xEih'wTl,/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1026135513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026135513L))
            info.setReturnValue(-607158795);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x__352426391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-352426391L))
            info.setReturnValue(3.99072E8F);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y__323797240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-323797240L))
            info.setReturnValue(3.99072E8F);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_1705434529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705434529L))
            info.setReturnValue(1942279012);
    }

    @Inject(at = @At("HEAD"), method = "string()Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private void string_346278531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(346278531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix4fc;", cancellable = true)
    private void pose__1256393747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1256393747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backgroundColor()I", cancellable = true)
    private void backgroundColor_1602415983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1602415983L))
            info.setReturnValue(41039510);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_276359668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(276359668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dropShadow()Z", cancellable = true)
    private void dropShadow__1778483354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778483354L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "outlineColor()I", cancellable = true)
    private void outlineColor__820717693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-820717693L))
            info.setReturnValue(-2027394575);
    }

    @Inject(at = @At("HEAD"), method = "lightCoords()I", cancellable = true)
    private void lightCoords_1116221136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116221136L))
            info.setReturnValue(-1554156929);
    }

    @Inject(at = @At("HEAD"), method = "displayMode()Lnet/minecraft/client/gui/Font$DisplayMode;", cancellable = true)
    private void displayMode__1590631671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1590631671L))
            info.setReturnValue(net.minecraft.client.gui.Font.DisplayMode.POLYGON_OFFSET);
    }


}
