package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.MemoryServerHandshakePacketListenerImpl.class)
public class MemoryServerHandshakePacketListenerImpl1331065889Mixin {
        @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect__756804424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-756804424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleIntention(Lnet/minecraft/network/protocol/handshake/ClientIntentionPacket;)V", cancellable = true)
    private void handleIntention_1397693428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1397693428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_1369344472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1369344472L))
            info.setReturnValue(true);
    }


}
