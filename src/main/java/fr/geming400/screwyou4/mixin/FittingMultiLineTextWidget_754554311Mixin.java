package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.FittingMultiLineTextWidget.class)
public class FittingMultiLineTextWidget_754554311Mixin {
        @Inject(at = @At("HEAD"), method = "setMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setMessage_2147164968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2147164968L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "minimizeHeight()V", cancellable = true)
    private void minimizeHeight_1221615156(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1221615156L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showingScrollBar()Z", cancellable = true)
    private void showingScrollBar_1301200988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301200988L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setWidth(I)V", cancellable = true)
    private void setWidth__934643594(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-934643594L))
            info.cancel();
    }


}
