package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.FocusableTextWidget.class)
public class FocusableTextWidget1560941941Mixin {
        @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/network/chat/Component;Lnet/minecraft/client/gui/Font;)Lnet/minecraft/client/gui/components/FocusableTextWidget$Builder;", cancellable = true)
    private static void builder_1047053047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1047053047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/network/chat/Component;Lnet/minecraft/client/gui/Font;I)Lnet/minecraft/client/gui/components/FocusableTextWidget$Builder;", cancellable = true)
    private static void builder_1420560250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420560250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setMessage__1341414697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1341414697L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1529888310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1529888310L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__164675234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-164675234L))
            info.setReturnValue(1901335882);
    }

    @Inject(at = @At("HEAD"), method = "playDownSound(Lnet/minecraft/client/sounds/SoundManager;)V", cancellable = true)
    private void playDownSound_779581605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(779581605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractWidgetRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractWidgetRenderState__1646340941(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1646340941L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPadding()I", cancellable = true)
    private void getPadding__434363296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-434363296L))
            info.setReturnValue(218319766);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth__376954549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-376954549L))
            info.setReturnValue(1417429148);
    }

    @Inject(at = @At("HEAD"), method = "setMaxWidth(I)Lnet/minecraft/client/gui/components/MultiLineTextWidget;", cancellable = true)
    private void setMaxWidth_1374448013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1374448013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateWidth()V", cancellable = true)
    private void updateWidth__1362884661(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1362884661L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateHeight()V", cancellable = true)
    private void updateHeight__664112424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-664112424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setNarrateMessage(Z)V", cancellable = true)
    private void setNarrateMessage_1123008060(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1123008060L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setUsageNarration(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setUsageNarration__631268947(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-631268947L))
            info.cancel();
    }


}
