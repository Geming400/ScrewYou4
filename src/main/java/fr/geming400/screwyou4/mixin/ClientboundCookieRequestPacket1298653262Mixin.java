package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.cookie.ClientboundCookieRequestPacket.class)
public class ClientboundCookieRequestPacket1298653262Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__380371826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-380371826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1610801775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610801775L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_163193287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(163193287L))
            info.setReturnValue("Y1R\u58DA\u32E2\u1685P\u8221:cZr\uD4CD_4\u4665g9hk2O'\uD1AD<BBd<hq5+YT*ZI\uB42F)l;$\uF93C\"%[\uA5E6at-9t ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1336916004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336916004L))
            info.setReturnValue(1101645996);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void key__1144413291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1144413291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1976722175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1976722175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/cookie/ClientCookiePacketListener;)V", cancellable = true)
    private void handle_1290300380(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1290300380L))
            info.cancel();
    }


}
