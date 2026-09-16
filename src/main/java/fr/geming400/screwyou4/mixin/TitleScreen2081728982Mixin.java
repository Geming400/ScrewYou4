package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.TitleScreen.class)
public class TitleScreen2081728982Mixin {
        @Inject(at = @At("HEAD"), method = "added()V", cancellable = true)
    private void added_375091081(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(375091081L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_1642648617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1642648617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1952045324(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1952045324L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_1541222806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1541222806L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1492632604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1492632604L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1226358672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1226358672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen__1477415915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1477415915L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__811783781(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-811783781L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerTextures(Lnet/minecraft/client/renderer/texture/TextureManager;)V", cancellable = true)
    private static void registerTextures_171503187(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(171503187L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canInterruptWithAnotherScreen()Z", cancellable = true)
    private void canInterruptWithAnotherScreen_322352983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322352983L))
            info.setReturnValue(true);
    }


}
