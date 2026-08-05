package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundStoreCookiePacket.class)
public class ClientboundStoreCookiePacket_1945236710Mixin {
        @Inject(at = @At("HEAD"), method = "payload()[B", cancellable = true)
    private void payload__1163895957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163895957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_266211621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(266211621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__964218328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964218328L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_809776734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809776734L))
            info.setReturnValue("!锥賎A_,)2j툌cqJfa2qkV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1983499451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983499451L))
            info.setReturnValue(-2020251293);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void key__497829844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-497829844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1671661674(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1671661674L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_484987155(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(484987155L))
            info.cancel();
    }


}
