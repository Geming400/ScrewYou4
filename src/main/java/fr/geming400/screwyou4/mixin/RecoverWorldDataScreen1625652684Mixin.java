package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.RecoverWorldDataScreen.class)
public class RecoverWorldDataScreen1625652684Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1663927423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1663927423L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__551256481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-551256481L))
            info.setReturnValue(null);
    }


}
