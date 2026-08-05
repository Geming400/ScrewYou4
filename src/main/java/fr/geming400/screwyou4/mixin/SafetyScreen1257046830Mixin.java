package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.multiplayer.SafetyScreen.class)
public class SafetyScreen1257046830Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__1811904984(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1811904984L))
            info.cancel();
    }


}
