package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.friends.FriendsOverlayScreen.class)
public class FriendsOverlayScreen_1247785759Mixin {
        @Inject(at = @At("HEAD"), method = "added()V", cancellable = true)
    private void added__458852143(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-458852143L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_808705393(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(808705393L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__1821166056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1821166056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1118102100(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1118102100L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1216732127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1216732127L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_707279582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707279582L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__1645727005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1645727005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOverlayWidth()I", cancellable = true)
    private void getOverlayWidth__1752528200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1752528200L))
            info.setReturnValue(-1842811649);
    }

    @Inject(at = @At("HEAD"), method = "refreshLists()V", cancellable = true)
    private void refreshLists_1627858071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1627858071L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyPresenceUpdate()V", cancellable = true)
    private void applyPresenceUpdate__576468897(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-576468897L))
            info.cancel();
    }


}
