package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.ServerHandshakePacketListenerImpl.class)
public class ServerHandshakePacketListenerImpl_408399326Mixin {
        @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_446677908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446677908L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleIntention(Lnet/minecraft/network/protocol/handshake/ClientIntentionPacket;)V", cancellable = true)
    private void handleIntention_475026864(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(475026864L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect__1679470988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1679470988L))
            info.cancel();
    }


}
