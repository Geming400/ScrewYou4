package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.TitleScreen.class)
public class TitleScreen2081728982Mixin {
        @Inject(at = @At("HEAD"), method = "added()V", cancellable = true)
    private void added_2120003721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2120003721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_2120003721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2120003721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2120003721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2120003721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerTextures(Lnet/minecraft/client/renderer/texture/TextureManager;)V", cancellable = true)
    private static void registerTextures_314508718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(314508718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canInterruptWithAnotherScreen()Z", cancellable = true)
    private void canInterruptWithAnotherScreen_2120007565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2120007565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1122041610(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1122041610L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_2120007565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2120007565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_1122041610(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1122041610L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_2120007565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2120007565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_467070104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467070104L))
            info.setReturnValue(null);
    }


}
