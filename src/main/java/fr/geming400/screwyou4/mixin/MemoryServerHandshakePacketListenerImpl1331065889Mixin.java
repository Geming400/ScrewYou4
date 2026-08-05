package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.MemoryServerHandshakePacketListenerImpl.class)
public class MemoryServerHandshakePacketListenerImpl1331065889Mixin {
        @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect_1632328253(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1632328253L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleIntention(Lnet/minecraft/network/protocol/handshake/ClientIntentionPacket;)V", cancellable = true)
    private void handleIntention__38889520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-38889520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_1382691356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1382691356L))
            info.setReturnValue(true);
    }


}
