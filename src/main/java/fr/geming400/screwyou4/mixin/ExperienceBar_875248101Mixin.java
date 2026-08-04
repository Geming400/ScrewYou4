package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.contextualbar.ExperienceBar.class)
public class ExperienceBar_875248101Mixin {
        @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void extractBackground_1245844233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1245844233L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void extractRenderState_1245844233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1245844233L))
            info.cancel();
    }


}
