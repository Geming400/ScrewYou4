package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.contextualbar.JumpableVehicleBar.class)
public class JumpableVehicleBar1706068897Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void extractRenderState_1115590188(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1115590188L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void extractBackground__997389481(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-997389481L))
            info.cancel();
    }


}
