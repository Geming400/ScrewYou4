package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundUpdateTagsPacket.class)
public class ClientboundUpdateTagsPacket_472189041Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1206836048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1206836048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1150257953(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1150257953L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle__988060514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-988060514L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTags()Ljava/util/Map;", cancellable = true)
    private void getTags__1532434600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1532434600L))
            info.setReturnValue(null);
    }


}
