package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ChatSelectionScreen.ChatSelectionList.class)
public class ChatSelectionList_864327456Mixin {
        @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/screens/reporting/ChatSelectionScreen$ChatSelectionList$Entry;)V", cancellable = true)
    private void setSelected_188812178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(188812178L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/components/AbstractSelectionList$Entry;)V", cancellable = true)
    private void setSelected__1573162808(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1573162808L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acceptDivider(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void acceptDivider__1036851482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1036851482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxVisibleEntries()I", cancellable = true)
    private void getMaxVisibleEntries_902589701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902589701L))
            info.setReturnValue(735563162);
    }

    @Inject(at = @At("HEAD"), method = "getFooterTop()I", cancellable = true)
    private void getFooterTop_902589701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902589701L))
            info.setReturnValue(735563162);
    }

    @Inject(at = @At("HEAD"), method = "acceptMessage(ILnet/minecraft/client/multiplayer/chat/LoggedChatMessage$Player;)V", cancellable = true)
    private void acceptMessage_751959824(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(751959824L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth_902589701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902589701L))
            info.setReturnValue(735563162);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__52308259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-52308259L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setScrollAmount(D)V", cancellable = true)
    private void setScrollAmount_2073626822(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2073626822L))
            info.cancel();
    }


}
