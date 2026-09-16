package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.ChatScreen.class)
public class ChatScreen772583500Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_333503135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(333503135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize__345032981(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-345032981L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1998598982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1998598982L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_741529869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(741529869L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedInPortal()Z", cancellable = true)
    private void isAllowedInPortal__1424152012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1424152012L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_232077324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(232077324L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled_1600299570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1600299570L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1759463142(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1759463142L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChatInput(Ljava/lang/String;Z)V", cancellable = true)
    private void handleChatInput__148547511(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-148547511L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveInHistory(I)V", cancellable = true)
    private void moveInHistory_2053727190(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2053727190L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "normalizeChatMessage(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void normalizeChatMessage__1013637299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1013637299L))
            info.setReturnValue("7$G}\u6A749V4C__\u9AB6}($I\uA02CGe0piFcfLCu<\u2C16aB");
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_1508405899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508405899L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__2120929263(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2120929263L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "insertText(Ljava/lang/String;Z)V", cancellable = true)
    private void insertText_2123157957(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2123157957L))
            info.cancel();
    }


}
