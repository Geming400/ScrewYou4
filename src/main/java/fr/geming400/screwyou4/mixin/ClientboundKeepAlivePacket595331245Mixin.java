package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundKeepAlivePacket.class)
public class ClientboundKeepAlivePacket595331245Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1083693843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1083693843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()J", cancellable = true)
    private void getId_633594452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(633594452L))
            info.setReturnValue(-3722643611466930372L);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1273400158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1273400158L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle__864918309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-864918309L))
            info.cancel();
    }


}
