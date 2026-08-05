package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.ping.ServerboundPingRequestPacket.class)
public class ServerboundPingRequestPacket_2049321076Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_370295987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370295987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1567577308(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1567577308L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/ping/ServerPingPacketListener;)V", cancellable = true)
    private void handle_2104209353(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2104209353L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTime()J", cancellable = true)
    private void getTime_2087584282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087584282L))
            info.setReturnValue(-2628806194311852730L);
    }


}
