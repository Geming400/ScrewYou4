package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.SignedMessageBody.class)
public class SignedMessageBody_1458913297Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1450541741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450541741L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_323453321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(323453321L))
            info.setReturnValue("R}(PQhB` YW<|d^AoWB)H@ffVtL!h*2EPn*z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1497176038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497176038L))
            info.setReturnValue(477494258);
    }

    @Inject(at = @At("HEAD"), method = "unsigned(Ljava/lang/String;)Lnet/minecraft/network/chat/SignedMessageBody;", cancellable = true)
    private static void unsigned_221435969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(221435969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "content()Ljava/lang/String;", cancellable = true)
    private void content_323452825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(323452825L))
            info.setReturnValue("r}[L)o$e4\u91DE&.ZJng3uUs8a\u1FC0{x`E@L}\u5789!uYcPoy");
    }

    @Inject(at = @At("HEAD"), method = "salt()J", cancellable = true)
    private void salt_1497176503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497176503L))
            info.setReturnValue(5411753622332836214L);
    }

    @Inject(at = @At("HEAD"), method = "updateSignature(Lnet/minecraft/util/SignatureUpdater$Output;)V", cancellable = true)
    private void updateSignature__54446665(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-54446665L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack(Lnet/minecraft/network/chat/MessageSignatureCache;)Lnet/minecraft/network/chat/SignedMessageBody$Packed;", cancellable = true)
    private void pack__788456829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-788456829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastSeen()Lnet/minecraft/network/chat/LastSeenMessages;", cancellable = true)
    private void lastSeen_743620021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(743620021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeStamp()Ljava/time/Instant;", cancellable = true)
    private void timeStamp__1738819800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1738819800L))
            info.setReturnValue(null);
    }


}
