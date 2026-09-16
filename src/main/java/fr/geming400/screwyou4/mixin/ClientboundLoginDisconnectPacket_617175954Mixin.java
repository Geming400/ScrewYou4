package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ClientboundLoginDisconnectPacket.class)
public class ClientboundLoginDisconnectPacket_617175954Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_773043543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(773043543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__291450315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-291450315L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1387599478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387599478L))
            info.setReturnValue("/m83<D\u75E3!(d");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1174528044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174528044L))
            info.setReturnValue(-771477094);
    }

    @Inject(at = @At("HEAD"), method = "reason()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void reason_2073614696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073614696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_321464090(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(321464090L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ClientLoginPacketListener;)V", cancellable = true)
    private void handle_1447984153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1447984153L))
            info.cancel();
    }


}
