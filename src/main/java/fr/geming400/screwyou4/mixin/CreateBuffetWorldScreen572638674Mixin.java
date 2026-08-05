package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.CreateBuffetWorldScreen.class)
public class CreateBuffetWorldScreen572638674Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1798654156(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1798654156L))
            info.cancel();
    }


}
