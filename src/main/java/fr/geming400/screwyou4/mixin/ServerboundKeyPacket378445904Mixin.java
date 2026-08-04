package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ServerboundKeyPacket.class)
public class ServerboundKeyPacket378445904Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1300579184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1300579184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ServerLoginPacketListener;)V", cancellable = true)
    private void handle__1483429512(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1483429512L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1056514817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1056514817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSecretKey(Ljava/security/PrivateKey;)Ljavax/crypto/SecretKey;", cancellable = true)
    private void getSecretKey__356319757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-356319757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isChallengeValid([BLjava/security/PrivateKey;)Z", cancellable = true)
    private void isChallengeValid__1592711425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592711425L))
            info.setReturnValue(null);
    }


}
