package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen.class)
public class JoinMultiplayerScreen314837134Mixin {
        @Inject(at = @At("HEAD"), method = "join(Lnet/minecraft/client/multiplayer/ServerData;)V", cancellable = true)
    private void join__190755856(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-190755856L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed__124243231(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-124243231L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1540852616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1540852616L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_185153476(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(185153476L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getServers()Lnet/minecraft/client/multiplayer/ServerList;", cancellable = true)
    private void getServers__444171022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-444171022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPinger()Lnet/minecraft/client/multiplayer/ServerStatusPinger;", cancellable = true)
    private void getPinger__101753692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-101753692L))
            info.setReturnValue(new net.minecraft.client.multiplayer.ServerStatusPinger());
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_283783503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(283783503L))
            info.setReturnValue(false);
    }


}
