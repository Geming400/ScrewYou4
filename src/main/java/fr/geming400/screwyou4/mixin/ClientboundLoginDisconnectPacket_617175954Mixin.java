package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ClientboundLoginDisconnectPacket.class)
public class ClientboundLoginDisconnectPacket_617175954Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1061849135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1061849135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2002688212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2002688212L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__518284022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-518284022L))
            info.setReturnValue("$0%jEe3{G7sVcZ!\uCCF73c! 8!#[P_htZ5u{HV\uA825\u8147>\u0308:UA?M\u83FF$x\"R`\uC087D{a}}Gfr:4Z$[,\u08BFc90\"]ke?%\u7344Wr\u2A68?BBg");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_655438695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655438695L))
            info.setReturnValue(1137142874);
    }

    @Inject(at = @At("HEAD"), method = "reason()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void reason__1559733212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1559733212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1295244866(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1295244866L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ClientLoginPacketListener;)V", cancellable = true)
    private void handle__1619193535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1619193535L))
            info.cancel();
    }


}
