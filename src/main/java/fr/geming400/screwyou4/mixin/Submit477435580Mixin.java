package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.NameTagFeatureRenderer.Submit.class)
public class Submit477435580Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1862947839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862947839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__658024395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-658024395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_515698322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(515698322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x_515694943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(515694943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y_515694943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(515694943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_515697826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(515697826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text__1699473585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1699473585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceToCameraSq()F", cancellable = true)
    private void distanceToCameraSq_515694943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(515694943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backgroundColor()I", cancellable = true)
    private void backgroundColor_515697826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(515697826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightCoords()I", cancellable = true)
    private void lightCoords_515697826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(515697826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayMode()Lnet/minecraft/client/gui/Font$DisplayMode;", cancellable = true)
    private void displayMode__1597832020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1597832020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_1508519106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508519106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix4fc;", cancellable = true)
    private void pose__2074557478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2074557478L))
            info.setReturnValue(null);
    }


}
