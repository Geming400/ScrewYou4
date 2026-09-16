package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.SpacerElement.class)
public class SpacerElement_1978758622Mixin {
        @Inject(at = @At("HEAD"), method = "width(I)Lnet/minecraft/client/gui/layouts/SpacerElement;", cancellable = true)
    private static void width_383567518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(383567518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY__1412771360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1412771360L))
            info.setReturnValue(1835423858);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX__1441400511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1441400511L))
            info.setReturnValue(-1365104149);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_253141446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253141446L))
            info.setReturnValue(1907508448);
    }

    @Inject(at = @At("HEAD"), method = "height(I)Lnet/minecraft/client/gui/layouts/SpacerElement;", cancellable = true)
    private static void height_1157971421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1157971421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitWidgets(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitWidgets_1292367902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1292367902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setX(I)V", cancellable = true)
    private void setX_997633215(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(997633215L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_40862131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(40862131L))
            info.setReturnValue(-1132274380);
    }

    @Inject(at = @At("HEAD"), method = "setY(I)V", cancellable = true)
    private void setY_1885136896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1885136896L))
            info.cancel();
    }


}
