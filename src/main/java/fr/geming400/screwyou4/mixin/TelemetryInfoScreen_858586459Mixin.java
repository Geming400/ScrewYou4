package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.telemetry.TelemetryInfoScreen.class)
public class TelemetryInfoScreen_858586459Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_896861197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(896861197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__1318322707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1318322707L))
            info.setReturnValue(null);
    }


}
