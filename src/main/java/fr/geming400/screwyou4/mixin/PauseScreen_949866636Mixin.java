package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.PauseScreen.class)
public class PauseScreen_949866636Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_988141374(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(988141374L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_988141374(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(988141374L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showsPauseMenu()Z", cancellable = true)
    private void showsPauseMenu_988145218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(988145218L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__9820737(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-9820737L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rendersNowPlayingToast()Z", cancellable = true)
    private void rendersNowPlayingToast_988145218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(988145218L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__9820737(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-9820737L))
            info.cancel();
    }


}
