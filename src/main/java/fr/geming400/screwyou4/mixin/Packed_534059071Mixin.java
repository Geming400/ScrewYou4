package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.SignedMessageBody.Packed.class)
public class Packed_534059071Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1919571329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919571329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__601400905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-601400905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_572321812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572321812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_180565949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(180565949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "content()Ljava/lang/String;", cancellable = true)
    private void content__601401401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-601401401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "salt()J", cancellable = true)
    private void salt_572322277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572322277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/network/chat/MessageSignatureCache;)Ljava/util/Optional;", cancellable = true)
    private void unpack__620981780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620981780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeStamp()Ljava/time/Instant;", cancellable = true)
    private void timeStamp_1631293270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1631293270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastSeen()Lnet/minecraft/network/chat/LastSeenMessages$Packed;", cancellable = true)
    private void lastSeen__1506619953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506619953L))
            info.setReturnValue(null);
    }


}
