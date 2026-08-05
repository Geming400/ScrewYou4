package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.ServerHandshakePacketListenerImpl.class)
public class ServerHandshakePacketListenerImpl_408399326Mixin {
        @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect_709661689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(709661689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleIntention(Lnet/minecraft/network/protocol/handshake/ClientIntentionPacket;)V", cancellable = true)
    private void handleIntention__961556084(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-961556084L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_460024792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(460024792L))
            info.setReturnValue(true);
    }


}
