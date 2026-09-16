package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ChatSelectionScreen.ChatSelectionList.MessageEntry.class)
public class MessageEntry_466005207Mixin {
        @Inject(at = @At("HEAD"), method = "isSelected()Z", cancellable = true)
    private void isSelected__256995384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-256995384L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration_1184169813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184169813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__74500970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-74500970L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_434951575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(434951575L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canSelect()Z", cancellable = true)
    private void canSelect__1885441759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1885441759L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canReport()Z", cancellable = true)
    private void canReport_1947513833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947513833L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_980762690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(980762690L))
            info.cancel();
    }


}
