package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.SignedMessageBody.class)
public class SignedMessageBody_1458913297Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_550287028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550287028L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2065630475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2065630475L))
            info.setReturnValue("uzv= \u00D8ZA:4:wG>t/Mu\u3A05\u1E79<L\uD33E6\u51B0D)T\u1B5AA[+m=>p BPAZT>,\u5C32yg_[D1^^B:|Rk|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2016265387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2016265387L))
            info.setReturnValue(199062937);
    }

    @Inject(at = @At("HEAD"), method = "unsigned(Ljava/lang/String;)Lnet/minecraft/network/chat/SignedMessageBody;", cancellable = true)
    private static void unsigned__1199926090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1199926090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "content()Ljava/lang/String;", cancellable = true)
    private void content__45014190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-45014190L))
            info.setReturnValue("<7QD]1p3\u36FF\uAE109#zGjoC19\uAA09ysK-HPZV+J");
    }

    @Inject(at = @At("HEAD"), method = "salt()J", cancellable = true)
    private void salt_1734352673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1734352673L))
            info.setReturnValue(6036621269549599445L);
    }

    @Inject(at = @At("HEAD"), method = "updateSignature(Lnet/minecraft/util/SignatureUpdater$Output;)V", cancellable = true)
    private void updateSignature__891610200(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-891610200L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack(Lnet/minecraft/network/chat/MessageSignatureCache;)Lnet/minecraft/network/chat/SignedMessageBody$Packed;", cancellable = true)
    private void pack_949226186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949226186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeStamp()Ljava/time/Instant;", cancellable = true)
    private void timeStamp__1059731086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1059731086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastSeen()Lnet/minecraft/network/chat/LastSeenMessages;", cancellable = true)
    private void lastSeen_1056452516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1056452516L))
            info.setReturnValue(null);
    }


}
