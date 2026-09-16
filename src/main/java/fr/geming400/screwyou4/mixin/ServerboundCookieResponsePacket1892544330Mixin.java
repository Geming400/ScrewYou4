package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.cookie.ServerboundCookieResponsePacket.class)
public class ServerboundCookieResponsePacket1892544330Mixin {
        @Inject(at = @At("HEAD"), method = "payload()[B", cancellable = true)
    private void payload__1172286242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172286242L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2048411920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2048411920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_983918062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(983918062L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1631999441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1631999441L))
            info.setReturnValue("}_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1845070875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1845070875L))
            info.setReturnValue(635481877);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void key_338380272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(338380272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1596832467(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1596832467L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/cookie/ServerCookiePacketListener;)V", cancellable = true)
    private void handle_1818798904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1818798904L))
            info.cancel();
    }


}
