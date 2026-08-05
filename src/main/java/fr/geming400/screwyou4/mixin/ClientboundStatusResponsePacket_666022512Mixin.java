package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.status.ClientboundStatusResponsePacket.class)
public class ClientboundStatusResponsePacket_666022512Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_821890101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821890101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__242603757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-242603757L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1436446036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1436446036L))
            info.setReturnValue("VkEpV:^@\u7492\u8937jzy]DT\u6338!\u0588u5?=^M\u1DF8Y4[h^(U:3N&O*MUhXaEG<<pHv}Sx\u061B\u2235\u4EB6[$3mPqZO;+@El9fV,ui\u23CE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1223374602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1223374602L))
            info.setReturnValue(1113836982);
    }

    @Inject(at = @At("HEAD"), method = "status()Lnet/minecraft/network/protocol/status/ServerStatus;", cancellable = true)
    private void status_2111231359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111231359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_370310648(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(370310648L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/status/ClientStatusPacketListener;)V", cancellable = true)
    private void handle_88630293(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(88630293L))
            info.cancel();
    }


}
