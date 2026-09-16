package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.IMEPreeditOverlay.class)
public class IMEPreeditOverlay_1326576362Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1981511293(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1981511293L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateInputPosition(II)V", cancellable = true)
    private void updateInputPosition__1576058702(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1576058702L))
            info.cancel();
    }


}
