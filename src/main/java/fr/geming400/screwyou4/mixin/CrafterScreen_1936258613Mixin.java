package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.CrafterScreen.class)
public class CrafterScreen_1936258613Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_976571240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(976571240L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_976571240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(976571240L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractSlot(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/world/inventory/Slot;II)V", cancellable = true)
    private void extractSlot__1280282999(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1280282999L))
            info.cancel();
    }


}
