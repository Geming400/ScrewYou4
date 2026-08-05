package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ServerboundCustomPayloadPacket.class)
public class ServerboundCustomPayloadPacket973232074Mixin {
        @Inject(at = @At("HEAD"), method = "payload()Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload;", cancellable = true)
    private void payload_1032331615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1032331615L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__705793014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705793014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1936222963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936222963L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__162227901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162227901L))
            info.setReturnValue("W%&u==NQ0i粲ற朓)%br(^iSN%q");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1011494816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011494816L))
            info.setReturnValue(-460520698);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1651300987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1651300987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ServerCommonPacketListener;)V", cancellable = true)
    private void handle__1762603136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1762603136L))
            info.cancel();
    }


}
