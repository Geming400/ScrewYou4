package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.VideoSettingsScreen.class)
public class VideoSettingsScreen364714044Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_402988783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(402988783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_402988783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(402988783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_402988783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(402988783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateTransparencyButton()V", cancellable = true)
    private void updateTransparencyButton_402988783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(402988783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateFullscreenButton(Z)V", cancellable = true)
    private void updateFullscreenButton_1594330873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1594330873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled_1564625651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1564625651L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__1249944834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249944834L))
            info.setReturnValue(true);
    }


}
