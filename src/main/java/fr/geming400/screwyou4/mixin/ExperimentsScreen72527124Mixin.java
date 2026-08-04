package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.ExperimentsScreen.class)
public class ExperimentsScreen72527124Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_110801863(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(110801863L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__2104382041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2104382041L))
            info.setReturnValue(null);
    }


}
