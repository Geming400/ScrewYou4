package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ChatSelectionScreen.ChatSelectionList.class)
public class ChatSelectionList_864327456Mixin {
        @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/screens/reporting/ChatSelectionScreen$ChatSelectionList$Entry;)V", cancellable = true)
    private void setSelected_2058089365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2058089365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/components/AbstractSelectionList$Entry;)V", cancellable = true)
    private void setSelected__1974562779(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1974562779L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setScrollAmount(D)V", cancellable = true)
    private void setScrollAmount__1695020403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1695020403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth__928893757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-928893757L))
            info.setReturnValue(-295131388);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_833273824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(833273824L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "acceptMessage(ILnet/minecraft/client/multiplayer/chat/LoggedChatMessage$Player;)V", cancellable = true)
    private void acceptMessage_1758989743(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1758989743L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acceptDivider(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void acceptDivider__1033642667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1033642667L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFooterTop()I", cancellable = true)
    private void getFooterTop__2021501823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021501823L))
            info.setReturnValue(300047414);
    }

    @Inject(at = @At("HEAD"), method = "getMaxVisibleEntries()I", cancellable = true)
    private void getMaxVisibleEntries__2060934407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060934407L))
            info.setReturnValue(1198928482);
    }


}
