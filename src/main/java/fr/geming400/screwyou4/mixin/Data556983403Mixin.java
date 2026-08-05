package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.ProfilePublicKey.Data.class)
public class Data556983403Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__351643361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351643361L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1327406928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327406928L))
            info.setReturnValue("A[:<\uC6FB`URX\uD3DA\u7677b\uB758<)Kk^-VHH?]az(\u6DC4Y xu'+\u5721nT:<k\uB666LS* I");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1114335494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114335494L))
            info.setReturnValue(-546760678);
    }

    @Inject(at = @At("HEAD"), method = "key()Ljava/security/PublicKey;", cancellable = true)
    private void key__1253654660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1253654660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__872003255(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-872003255L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasExpired(Ljava/time/Duration;)Z", cancellable = true)
    private void hasExpired__1090928035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090928035L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasExpired()Z", cancellable = true)
    private void hasExpired__1198796329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1198796329L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "expiresAt()Ljava/time/Instant;", cancellable = true)
    private void expiresAt__1749434084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749434084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keySignature()[B", cancellable = true)
    private void keySignature_222964042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(222964042L))
            info.setReturnValue(null);
    }


}
