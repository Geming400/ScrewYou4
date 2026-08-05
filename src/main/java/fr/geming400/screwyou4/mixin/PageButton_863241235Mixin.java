package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.PageButton.class)
public class PageButton_863241235Mixin {
        @Inject(at = @At("HEAD"), method = "playDownSound(Lnet/minecraft/client/sounds/SoundManager;)V", cancellable = true)
    private void playDownSound_81880898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(81880898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldTakeFocusAfterInteraction()Z", cancellable = true)
    private void shouldTakeFocusAfterInteraction__357509259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357509259L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractContents(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractContents_1845434411(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1845434411L))
            info.cancel();
    }


}
