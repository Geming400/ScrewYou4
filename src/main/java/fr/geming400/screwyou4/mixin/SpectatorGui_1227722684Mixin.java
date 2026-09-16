package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.spectator.SpectatorGui.class)
public class SpectatorGui_1227722684Mixin {
        @Inject(at = @At("HEAD"), method = "onHotbarSelected(I)V", cancellable = true)
    private void onHotbarSelected__1347190777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1347190777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onHotbarActionKeyPressed()V", cancellable = true)
    private void onHotbarActionKeyPressed__1946426352(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1946426352L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isMenuActive()Z", cancellable = true)
    private void isMenuActive__118235965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-118235965L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onMouseScrolled(I)V", cancellable = true)
    private void onMouseScrolled_35190201(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(35190201L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSpectatorMenuClosed(Lnet/minecraft/client/gui/spectator/SpectatorMenu;)V", cancellable = true)
    private void onSpectatorMenuClosed__550628040(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-550628040L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractHotbar(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractHotbar_214136234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(214136234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractAction(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractAction__918822086(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-918822086L))
            info.cancel();
    }


}
