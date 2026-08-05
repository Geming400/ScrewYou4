package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.telemetry.TelemetryInfoScreen.class)
public class TelemetryInfoScreen_858586459Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_2084601940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2084601940L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__813256280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813256280L))
            info.setReturnValue(null);
    }


}
