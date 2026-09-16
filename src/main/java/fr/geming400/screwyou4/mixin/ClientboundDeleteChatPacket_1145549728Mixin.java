package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDeleteChatPacket.class)
public class ClientboundDeleteChatPacket_1145549728Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1301417317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301417317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_236923459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236923459L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1915973252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915973252L))
            info.setReturnValue(")^\u9D75lke\u6487A#W4xFIm@Em\u7C7E\u8029qT{aQ\u2367<]ka]ey#z'6r-cr4)\"m_<\uA6A1=lt+oJe+uo*R9\u1F54@B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1702901818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1702901818L))
            info.setReturnValue(-542323812);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__445927867(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-445927867L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_849837864(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(849837864L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "messageSignature()Lnet/minecraft/network/chat/MessageSignature$Packed;", cancellable = true)
    private void messageSignature__984839307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-984839307L))
            info.setReturnValue(null);
    }


}
