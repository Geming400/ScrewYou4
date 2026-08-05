package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.multiplayer.RestrictionsScreen.class)
public class RestrictionsScreen497089091Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1723104573(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1723104573L))
            info.cancel();
    }


}
