package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.VideoSettingsScreen.class)
public class VideoSettingsScreen364714044Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed__74366321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-74366321L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1590729526(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1590729526L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_235030386(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(235030386L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateFullscreenButton(Z)V", cancellable = true)
    private void updateFullscreenButton_2060996655(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2060996655L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled_1192430114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192430114L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__175792132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-175792132L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "updateTransparencyButton()V", cancellable = true)
    private void updateTransparencyButton_135973244(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(135973244L))
            info.cancel();
    }


}
