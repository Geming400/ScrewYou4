package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ServerboundKeyPacket.class)
public class ServerboundKeyPacket378445904Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_534313494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(534313494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ServerLoginPacketListener;)V", cancellable = true)
    private void handle_1583748176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1583748176L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_82734041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(82734041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSecretKey(Ljava/security/PrivateKey;)Ljavax/crypto/SecretKey;", cancellable = true)
    private void getSecretKey_1250708492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1250708492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isChallengeValid([BLjava/security/PrivateKey;)Z", cancellable = true)
    private void isChallengeValid__120379844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-120379844L))
            info.setReturnValue(false);
    }


}
