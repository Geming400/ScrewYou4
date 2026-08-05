package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.ServerStatusPacketListenerImpl.class)
public class ServerStatusPacketListenerImpl2036655381Mixin {
        @Inject(at = @At("HEAD"), method = "handlePingRequest(Lnet/minecraft/network/protocol/ping/ServerboundPingRequestPacket;)V", cancellable = true)
    private void handlePingRequest_1398571730(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1398571730L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleStatusRequest(Lnet/minecraft/network/protocol/status/ServerboundStatusRequestPacket;)V", cancellable = true)
    private void handleStatusRequest_708880722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(708880722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_2074933964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2074933964L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect__51214932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-51214932L))
            info.cancel();
    }


}
