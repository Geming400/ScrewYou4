package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundTransferPacket.class)
public class ClientboundTransferPacket910694152Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__768330936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-768330936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1998760885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1998760885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__224765823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-224765823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_948956894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948956894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle__549555402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-549555402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1588763065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1588763065L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "port()I", cancellable = true)
    private void port_948956398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948956398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "host()Ljava/lang/String;", cancellable = true)
    private void host__224766319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-224766319L))
            info.setReturnValue(null);
    }


}
