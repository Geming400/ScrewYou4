package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.FriendsButton.class)
public class FriendsButton94375161Mixin {
        @Inject(at = @At("HEAD"), method = "refreshIncomingRequestCount()V", cancellable = true)
    private void refreshIncomingRequestCount_132649900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(132649900L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractContents(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractContents__865312211(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-865312211L))
            info.cancel();
    }


}
