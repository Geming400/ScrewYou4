package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ClientboundHelloPacket.class)
public class ClientboundHelloPacket_981461301Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__697563788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697563788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ClientLoginPacketListener;)V", cancellable = true)
    private void handle__1254908188(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1254908188L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1659530213(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1659530213L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPublicKey()Ljava/security/PublicKey;", cancellable = true)
    private void getPublicKey_1358230084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1358230084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServerId()Ljava/lang/String;", cancellable = true)
    private void getServerId__153999171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-153999171L))
            info.setReturnValue("PB\uFA1Bd\u2A13{{j(E\u830FwV F[MA7kX#CyX)Kwi\uA921ZRvd{L:(6\u3784\u4E1Eb\u1A30\u67C8V;Eq\u5A1DI#\u81C1>IGOs#B#z.A,\u2BF4\uB1EA'GZY@^tl_<Eg'7\u5817J0B>rk?H0");
    }

    @Inject(at = @At("HEAD"), method = "getChallenge()[B", cancellable = true)
    private void getChallenge__2127671366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2127671366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldAuthenticate()Z", cancellable = true)
    private void shouldAuthenticate_1019739883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019739883L))
            info.setReturnValue(true);
    }


}
