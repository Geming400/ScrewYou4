package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.ManageServerScreen.class)
public class ManageServerScreen_1633932548Mixin {
        @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize_638053078(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(638053078L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1672207286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1672207286L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_674245175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(674245175L))
            info.cancel();
    }


}
