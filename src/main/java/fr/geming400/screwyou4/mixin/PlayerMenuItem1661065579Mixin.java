package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.spectator.PlayerMenuItem.class)
public class PlayerMenuItem1661065579Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName__515843586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-515843586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled_1699344162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699344162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractIcon(Lnet/minecraft/client/gui/GuiGraphicsExtractor;FF)V", cancellable = true)
    private void extractIcon__1507385901(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1507385901L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selectItem(Lnet/minecraft/client/gui/spectator/SpectatorMenu;)V", cancellable = true)
    private void selectItem__1308120349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1308120349L))
            info.cancel();
    }


}
