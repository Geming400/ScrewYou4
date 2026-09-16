package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.spectator.categories.SpectatorPage.class)
public class SpectatorPage279584976Mixin {
        @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/client/gui/spectator/SpectatorMenuItem;", cancellable = true)
    private void getItem_1960430655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960430655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedSlot()I", cancellable = true)
    private void getSelectedSlot_622661223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(622661223L))
            info.setReturnValue(751592468);
    }


}
