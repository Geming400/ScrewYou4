package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.spectator.SpectatorGui.class)
public class SpectatorGui_1227722684Mixin {
        @Inject(at = @At("HEAD"), method = "onSpectatorMenuClosed(Lnet/minecraft/client/gui/spectator/SpectatorMenu;)V", cancellable = true)
    private void onSpectatorMenuClosed__1741463245(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1741463245L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onHotbarSelected(I)V", cancellable = true)
    private void onHotbarSelected__1853327641(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1853327641L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onHotbarActionKeyPressed()V", cancellable = true)
    private void onHotbarActionKeyPressed_1265997422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1265997422L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onMouseScrolled(I)V", cancellable = true)
    private void onMouseScrolled__1853327641(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1853327641L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isMenuActive()Z", cancellable = true)
    private void isMenuActive_1266001266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1266001266L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractHotbar(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractHotbar_539807395(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(539807395L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractAction(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractAction_539807395(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(539807395L))
            info.cancel();
    }


}
