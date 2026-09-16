package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.PauseScreen.class)
public class PauseScreen_949866636Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__2119085179(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2119085179L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_820182977(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(820182977L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rendersNowPlayingToast()Z", cancellable = true)
    private void rendersNowPlayingToast_1024584784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1024584784L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1936746277(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1936746277L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showsPauseMenu()Z", cancellable = true)
    private void showsPauseMenu_2140493219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140493219L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__1943646128(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1943646128L))
            info.cancel();
    }


}
