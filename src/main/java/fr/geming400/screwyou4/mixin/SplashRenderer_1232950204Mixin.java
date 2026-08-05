package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.SplashRenderer.class)
public class SplashRenderer_1232950204Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;ILnet/minecraft/client/gui/Font;F)V", cancellable = true)
    private void extractRenderState_344196170(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(344196170L))
            info.cancel();
    }


}
