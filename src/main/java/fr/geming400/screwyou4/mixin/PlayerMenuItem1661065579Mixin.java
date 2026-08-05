package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.spectator.PlayerMenuItem.class)
public class PlayerMenuItem1661065579Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName_1153002431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1153002431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled__373082421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-373082421L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractIcon(Lnet/minecraft/client/gui/GuiGraphicsExtractor;FF)V", cancellable = true)
    private void extractIcon_2115029741(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2115029741L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selectItem(Lnet/minecraft/client/gui/spectator/SpectatorMenu;)V", cancellable = true)
    private void selectItem__2071798828(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2071798828L))
            info.cancel();
    }


}
