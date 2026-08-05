package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ReportPlayerScreen.class)
public class ReportPlayerScreen1287550505Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__1781401309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1781401309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__384292233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-384292233L))
            info.setReturnValue(null);
    }


}
