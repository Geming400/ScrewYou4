package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.cookie.ClientboundCookieRequestPacket.class)
public class ClientboundCookieRequestPacket1298653262Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1454520852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1454520852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_390026994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(390026994L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2069076787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2069076787L))
            info.setReturnValue("`]t/<5|e\u0F1A&hf\u36ACAg\uAB96}b]rbM,;&=\u333C ^\u57B0T4pj#{W\uA2F4%C\u0776Bg{'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1856005353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1856005353L))
            info.setReturnValue(-1937043310);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void key__255510796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-255510796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1002941399(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1002941399L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/cookie/ClientCookiePacketListener;)V", cancellable = true)
    private void handle__1794473804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1794473804L))
            info.cancel();
    }


}
