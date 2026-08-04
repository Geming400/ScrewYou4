package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.multiplayer.ServerSelectionList.OnlineServerEntry.class)
public class OnlineServerEntry_254673839Mixin {
        @Inject(at = @At("HEAD"), method = "join()V", cancellable = true)
    private void join_292948577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(292948577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_292948577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(292948577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateServerList()V", cancellable = true)
    private void updateServerList_292948577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(292948577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__661961876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-661961876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_1166348898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1166348898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration__1922235327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1922235327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServerData()Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private void getServerData__1383253088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1383253088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__1359985040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1359985040L))
            info.setReturnValue(null);
    }


}
