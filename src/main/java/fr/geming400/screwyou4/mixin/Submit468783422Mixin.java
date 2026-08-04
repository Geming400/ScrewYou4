package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.TextFeatureRenderer.Submit.class)
public class Submit468783422Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1854295681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854295681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__666676553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-666676553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_507046164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507046164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x_507042785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507042785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y_507042785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507042785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_507045668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507045668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "string()Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private void string_1528422450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1528422450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightCoords()I", cancellable = true)
    private void lightCoords_507045668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507045668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayMode()Lnet/minecraft/client/gui/Font$DisplayMode;", cancellable = true)
    private void displayMode__1606484178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1606484178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outlineColor()I", cancellable = true)
    private void outlineColor_507045668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507045668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backgroundColor()I", cancellable = true)
    private void backgroundColor_507045668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507045668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix4fc;", cancellable = true)
    private void pose__2083209636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083209636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dropShadow()Z", cancellable = true)
    private void dropShadow_507062005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507062005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_1499866948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1499866948L))
            info.setReturnValue(null);
    }


}
