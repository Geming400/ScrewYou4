package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen.class)
public class JoinMultiplayerScreen314837134Mixin {
        @Inject(at = @At("HEAD"), method = "join(Lnet/minecraft/client/multiplayer/ServerData;)V", cancellable = true)
    private void join_355323206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(355323206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_353111873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(353111873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_353111873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(353111873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_353111873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(353111873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getServers()Lnet/minecraft/client/multiplayer/ServerList;", cancellable = true)
    private void getServers_1710648076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1710648076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPinger()Lnet/minecraft/client/multiplayer/ServerStatusPinger;", cancellable = true)
    private void getPinger__2105900135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2105900135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__601798580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-601798580L))
            info.setReturnValue(null);
    }


}
