package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ReportPlayerScreen.class)
public class ReportPlayerScreen1287550505Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1325825244(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1325825244L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__889358660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-889358660L))
            info.setReturnValue(null);
    }


}
