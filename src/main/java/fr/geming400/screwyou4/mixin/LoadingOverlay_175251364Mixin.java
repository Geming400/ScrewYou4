package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.LoadingOverlay.class)
public class LoadingOverlay_175251364Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_45567705(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(45567705L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1162131005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1162131005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerTextures(Lnet/minecraft/client/renderer/texture/TextureManager;)V", cancellable = true)
    private static void registerTextures__1734974432(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1734974432L))
            info.cancel();
    }


}
