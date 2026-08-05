package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.FittingMultiLineTextWidget.class)
public class FittingMultiLineTextWidget_754554311Mixin {
        @Inject(at = @At("HEAD"), method = "setMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setMessage__1146624627(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1146624627L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showingScrollBar()Z", cancellable = true)
    private void showingScrollBar_792832893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792832893L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "minimizeHeight()V", cancellable = true)
    private void minimizeHeight_792829049(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(792829049L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWidth(I)V", cancellable = true)
    private void setWidth_1968471282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1968471282L))
            info.cancel();
    }


}
