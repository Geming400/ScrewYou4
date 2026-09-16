package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundPingPacket.class)
public class ClientboundPingPacket_508456065Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_664323654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(664323654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__1149867531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1149867531L))
            info.setReturnValue(-1771789395);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_212744201(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(212744201L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_258399622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(258399622L))
            info.cancel();
    }


}
