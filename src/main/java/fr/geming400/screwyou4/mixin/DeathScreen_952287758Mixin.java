package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.DeathScreen.class)
public class DeathScreen_952287758Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_990562496(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(990562496L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_990566340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(990566340L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedInPortal()Z", cancellable = true)
    private void isAllowedInPortal_990566340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(990566340L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__7399615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-7399615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_990566340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(990566340L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__7399615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-7399615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__662371121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662371121L))
            info.setReturnValue(true);
    }


}
