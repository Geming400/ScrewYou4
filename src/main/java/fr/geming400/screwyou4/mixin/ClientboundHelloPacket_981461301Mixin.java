package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ClientboundHelloPacket.class)
public class ClientboundHelloPacket_981461301Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1137328890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137328890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ClientLoginPacketListener;)V", cancellable = true)
    private void handle_1812269500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1812269500L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_685749437(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(685749437L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPublicKey()Ljava/security/PublicKey;", cancellable = true)
    private void getPublicKey__707042876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-707042876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChallenge()[B", cancellable = true)
    private void getChallenge_392595367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(392595367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldAuthenticate()Z", cancellable = true)
    private void shouldAuthenticate__1927758909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1927758909L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getServerId()Ljava/lang/String;", cancellable = true)
    private void getServerId_1781021425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781021425L))
            info.setReturnValue("\uD7E1\u0C3D;5nd\uFCF70OH I4\uC7E1Km>k]");
    }


}
