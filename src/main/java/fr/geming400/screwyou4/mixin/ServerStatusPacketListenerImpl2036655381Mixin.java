package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.ServerStatusPacketListenerImpl.class)
public class ServerStatusPacketListenerImpl2036655381Mixin {
        @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect__1957049551(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1957049551L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePingRequest(Lnet/minecraft/network/protocol/ping/ServerboundPingRequestPacket;)V", cancellable = true)
    private void handlePingRequest_1267029949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1267029949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleStatusRequest(Lnet/minecraft/network/protocol/status/ServerboundStatusRequestPacket;)V", cancellable = true)
    private void handleStatusRequest__250884803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-250884803L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_2088280848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2088280848L))
            info.setReturnValue(true);
    }


}
