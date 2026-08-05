package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.ExperimentsScreen.class)
public class ExperimentsScreen72527124Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1298542606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1298542606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__1599315614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1599315614L))
            info.setReturnValue(null);
    }


}
