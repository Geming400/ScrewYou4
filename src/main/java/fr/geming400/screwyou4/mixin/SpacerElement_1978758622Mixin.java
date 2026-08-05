package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.SpacerElement.class)
public class SpacerElement_1978758622Mixin {
        @Inject(at = @At("HEAD"), method = "width(I)Lnet/minecraft/client/gui/layouts/SpacerElement;", cancellable = true)
    private static void width_1549067428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549067428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY_2017020867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017020867L))
            info.setReturnValue(-859369251);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_2017020867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017020867L))
            info.setReturnValue(-859369251);
    }

    @Inject(at = @At("HEAD"), method = "setX(I)V", cancellable = true)
    private void setX__1102291703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1102291703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_2017020867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017020867L))
            info.setReturnValue(-859369251);
    }

    @Inject(at = @At("HEAD"), method = "setY(I)V", cancellable = true)
    private void setY__1102291703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1102291703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_2017020867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017020867L))
            info.setReturnValue(-859369251);
    }

    @Inject(at = @At("HEAD"), method = "height(I)Lnet/minecraft/client/gui/layouts/SpacerElement;", cancellable = true)
    private static void height_1549067428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549067428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitWidgets(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitWidgets__1635192262(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1635192262L))
            info.cancel();
    }


}
