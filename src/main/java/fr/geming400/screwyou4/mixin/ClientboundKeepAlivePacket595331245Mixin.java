package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundKeepAlivePacket.class)
public class ClientboundKeepAlivePacket595331245Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_751198835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(751198835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()J", cancellable = true)
    private void getId__1062991389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062991389L))
            info.setReturnValue(-8253858764854381985L);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_299619382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(299619382L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_345274803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(345274803L))
            info.cancel();
    }


}
