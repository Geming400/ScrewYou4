package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundPingPacket.class)
public class ClientboundPingPacket_508456065Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1170569024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1170569024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_546718310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(546718310L))
            info.setReturnValue(-1729219867);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1186524977(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1186524977L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle__951793490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-951793490L))
            info.cancel();
    }


}
