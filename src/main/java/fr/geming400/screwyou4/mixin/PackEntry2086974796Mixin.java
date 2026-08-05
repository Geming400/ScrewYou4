package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.packs.TransferableSelectionList.PackEntry.class)
public class PackEntry2086974796Mixin {
        @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent__1296317440(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1296317440L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration__89934369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89934369L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_472315918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(472315918L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPackId()Ljava/lang/String;", cancellable = true)
    private void getPackId_951514325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951514325L))
            info.setReturnValue("u\u3061&EjL,#WnL%.LTuZ..\u2B2C\u8E12\u4169@a,l\"x#^\u3354i %%\u15A8)\u61D68.R\u58A2[spR\u3928\uB883K\uFE7B\uB14D%M\u6856(%u$n:fm>\uA382q[<,\u0441fh\uC6265\u9D54");
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1170339082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1170339082L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldTakeFocusAfterInteraction()Z", cancellable = true)
    private void shouldTakeFocusAfterInteraction_2125253379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125253379L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "keyboardSelection()V", cancellable = true)
    private void keyboardSelection_2125249535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2125249535L))
            info.cancel();
    }


}
