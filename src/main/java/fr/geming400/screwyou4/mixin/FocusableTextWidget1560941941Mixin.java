package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.FocusableTextWidget.class)
public class FocusableTextWidget1560941941Mixin {
        @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/network/chat/Component;Lnet/minecraft/client/gui/Font;)Lnet/minecraft/client/gui/components/FocusableTextWidget$Builder;", cancellable = true)
    private static void builder_1245972764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245972764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/network/chat/Component;Lnet/minecraft/client/gui/Font;I)Lnet/minecraft/client/gui/components/FocusableTextWidget$Builder;", cancellable = true)
    private static void builder__1002863115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002863115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setMessage__340236996(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-340236996L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMaxWidth(I)Lnet/minecraft/client/gui/components/MultiLineTextWidget;", cancellable = true)
    private void setMaxWidth__536079543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536079543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_1599204187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599204187L))
            info.setReturnValue(-911509911);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_1599204187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599204187L))
            info.setReturnValue(-911509911);
    }

    @Inject(at = @At("HEAD"), method = "updateHeight()V", cancellable = true)
    private void updateHeight_1599216680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1599216680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setNarrateMessage(Z)V", cancellable = true)
    private void setNarrateMessage__1504408526(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1504408526L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWidth()V", cancellable = true)
    private void updateWidth_1599216680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1599216680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setUsageNarration(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setUsageNarration__164413616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-164413616L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractWidgetRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractWidgetRenderState_601254569(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(601254569L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playDownSound(Lnet/minecraft/client/sounds/SoundManager;)V", cancellable = true)
    private void playDownSound_1307752062(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1307752062L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPadding()I", cancellable = true)
    private void getPadding_1599204187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599204187L))
            info.setReturnValue(-911509911);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_644306227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644306227L))
            info.setReturnValue(false);
    }


}
