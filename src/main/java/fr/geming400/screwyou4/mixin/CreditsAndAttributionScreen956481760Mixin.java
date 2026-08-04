package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.CreditsAndAttributionScreen.class)
public class CreditsAndAttributionScreen956481760Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_994756499(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(994756499L))
            info.cancel();
    }


}
