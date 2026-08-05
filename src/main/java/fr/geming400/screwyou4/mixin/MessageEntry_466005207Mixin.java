package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ChatSelectionScreen.ChatSelectionList.MessageEntry.class)
public class MessageEntry_466005207Mixin {
        @Inject(at = @At("HEAD"), method = "isSelected()Z", cancellable = true)
    private void isSelected_504283789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504283789L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_1377680266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1377680266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration__1710903959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710903959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__450630508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-450630508L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canReport()Z", cancellable = true)
    private void canReport_504283789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504283789L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__1148653672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148653672L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canSelect()Z", cancellable = true)
    private void canSelect_504283789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504283789L))
            info.setReturnValue(true);
    }


}
