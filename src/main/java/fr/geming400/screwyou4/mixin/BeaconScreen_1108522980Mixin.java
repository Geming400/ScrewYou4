package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.BeaconScreen.class)
public class BeaconScreen_1108522980Mixin {
        @Inject(at = @At("HEAD"), method = "containerTick()V", cancellable = true)
    private void containerTick_1146797718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1146797718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_148835607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(148835607L))
            info.cancel();
    }


}
