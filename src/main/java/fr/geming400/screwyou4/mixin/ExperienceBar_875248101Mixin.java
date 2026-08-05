package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.contextualbar.ExperienceBar.class)
public class ExperienceBar_875248101Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void extractRenderState_284769391(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(284769391L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void extractBackground__1828210278(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1828210278L))
            info.cancel();
    }


}
