package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.ManageServerScreen.class)
public class ManageServerScreen_1633932548Mixin {
        @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize_516316066(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(516316066L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__1435019267(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1435019267L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1674155107(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1674155107L))
            info.cancel();
    }


}
