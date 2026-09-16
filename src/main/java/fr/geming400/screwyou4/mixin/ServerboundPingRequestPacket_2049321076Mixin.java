package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.ping.ServerboundPingRequestPacket.class)
public class ServerboundPingRequestPacket_2049321076Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2089778631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089778631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1753609212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1753609212L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/ping/ServerPingPacketListener;)V", cancellable = true)
    private void handle_315224225(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(315224225L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTime()J", cancellable = true)
    private void getTime_2023348407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023348407L))
            info.setReturnValue(8128490844562766329L);
    }


}
