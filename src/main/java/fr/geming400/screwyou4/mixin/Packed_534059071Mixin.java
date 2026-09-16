package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.SignedMessageBody.Packed.class)
public class Packed_534059071Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__374567198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-374567198L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1304482595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1304482595L))
            info.setReturnValue("5[Fr3C}\u694FXvr\uBE8F4jp|RC^\u50C6\u03B6QFPzR\u89CF,\u7967^!Ny\uAF04E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1091411161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1091411161L))
            info.setReturnValue(2111610634);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__894927588(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-894927588L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "content()Ljava/lang/String;", cancellable = true)
    private void content__969868416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-969868416L))
            info.setReturnValue("S}m\u13FCH\u49E7\uADB6");
    }

    @Inject(at = @At("HEAD"), method = "salt()J", cancellable = true)
    private void salt_809498447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809498447L))
            info.setReturnValue(-2291882946895815161L);
    }

    @Inject(at = @At("HEAD"), method = "timeStamp()Ljava/time/Instant;", cancellable = true)
    private void timeStamp__1984585312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1984585312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/network/chat/MessageSignatureCache;)Ljava/util/Optional;", cancellable = true)
    private void unpack__966826082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-966826082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastSeen()Lnet/minecraft/network/chat/LastSeenMessages$Packed;", cancellable = true)
    private void lastSeen__1611325184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1611325184L))
            info.setReturnValue(null);
    }


}
