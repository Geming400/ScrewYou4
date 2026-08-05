package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.friends.FriendsOverlayScreen.class)
public class FriendsOverlayScreen_1247785759Mixin {
        @Inject(at = @At("HEAD"), method = "added()V", cancellable = true)
    private void added_1286060497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1286060497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_1286060497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1286060497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1286060497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1286060497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1286060497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1286060497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_331150044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(331150044L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getOverlayWidth()I", cancellable = true)
    private void getOverlayWidth_1286048004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286048004L))
            info.setReturnValue(2127446962);
    }

    @Inject(at = @At("HEAD"), method = "refreshLists()V", cancellable = true)
    private void refreshLists_1286060497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1286060497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyPresenceUpdate()V", cancellable = true)
    private void applyPresenceUpdate_1286060497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1286060497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__366873120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-366873120L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_288098386(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(288098386L))
            info.cancel();
    }


}
