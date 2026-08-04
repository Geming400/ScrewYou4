package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.ProfilePublicKey.Data.class)
public class Data556983403Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1942495166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1942495166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__578476572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578476572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_595246145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595246145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "key()Ljava/security/PublicKey;", cancellable = true)
    private void key_933752187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(933752187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_203490282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(203490282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasExpired(Ljava/time/Duration;)Z", cancellable = true)
    private void hasExpired__208349400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-208349400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasExpired()Z", cancellable = true)
    private void hasExpired_595261986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595261986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expiresAt()Ljava/time/Instant;", cancellable = true)
    private void expiresAt_1654217603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1654217603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keySignature()[B", cancellable = true)
    private void keySignature_1742818033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1742818033L))
            info.setReturnValue(null);
    }


}
