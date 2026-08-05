package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.ChatScreen.class)
public class ChatScreen772583500Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_810858239(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(810858239L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize__223295969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-223295969L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_810858239(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(810858239L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__144052214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-144052214L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedInPortal()Z", cancellable = true)
    private void isAllowedInPortal_810862083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810862083L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__187103872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-187103872L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "insertText(Ljava/lang/String;Z)V", cancellable = true)
    private void insertText__2115826625(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2115826625L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_810862083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810862083L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__187103872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-187103872L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveInHistory(I)V", cancellable = true)
    private void moveInHistory_1986500472(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1986500472L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChatInput(Ljava/lang/String;Z)V", cancellable = true)
    private void handleChatInput__2115826625(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2115826625L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "normalizeChatMessage(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void normalizeChatMessage_1985325323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1985325323L))
            info.setReturnValue("B!\u6C67+e%3yB'D 3H$p\u8366\uA01AR^\u48E122-\u0DDE/X\u48C4W\u8498&T44\u99B1");
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__842075378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-842075378L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled_1972495107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972495107L))
            info.setReturnValue(true);
    }


}
