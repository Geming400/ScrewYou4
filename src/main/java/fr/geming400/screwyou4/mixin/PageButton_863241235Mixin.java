package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.PageButton.class)
public class PageButton_863241235Mixin {
        @Inject(at = @At("HEAD"), method = "extractContents(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractContents__96446138(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-96446138L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playDownSound(Lnet/minecraft/client/sounds/SoundManager;)V", cancellable = true)
    private void playDownSound_610051355(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(610051355L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldTakeFocusAfterInteraction()Z", cancellable = true)
    private void shouldTakeFocusAfterInteraction_901519817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901519817L))
            info.setReturnValue(false);
    }


}
