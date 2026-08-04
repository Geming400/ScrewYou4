package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.spectator.categories.SpectatorPage.class)
public class SpectatorPage279584976Mixin {
        @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/client/gui/spectator/SpectatorMenuItem;", cancellable = true)
    private void getItem_184334696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(184334696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedSlot()I", cancellable = true)
    private void getSelectedSlot_317847222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(317847222L))
            info.setReturnValue(null);
    }


}
