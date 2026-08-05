package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.ConfirmExperimentalFeaturesScreen.class)
public class ConfirmExperimentalFeaturesScreen_1196542941Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__1872408874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1872408874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__475299798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-475299798L))
            info.setReturnValue(null);
    }


}
