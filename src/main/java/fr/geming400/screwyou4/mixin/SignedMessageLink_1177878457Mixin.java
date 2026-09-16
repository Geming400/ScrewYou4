package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.SignedMessageLink.class)
public class SignedMessageLink_1177878457Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1871994892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1871994892L))
            info.setReturnValue(107695896);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_269252188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(269252188L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1948301981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948301981L))
            info.setReturnValue("\u2A5Bmu)5M^f+kQg\u2745oJ\"ENe\u4036:IB\u864D\u31D9WG#($T)x\u06178@vV\u835Ab7 -{B8<]cR2{K\u7021dqh\u2A80],w:n\u8CD0d\"x\u35F6\uB12D\uC292y[=;*t");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1735230547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1735230547L))
            info.setReturnValue(1876642690);
    }

    @Inject(at = @At("HEAD"), method = "root(Ljava/util/UUID;Ljava/util/UUID;)Lnet/minecraft/network/chat/SignedMessageLink;", cancellable = true)
    private static void root_9795605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(9795605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "advance()Lnet/minecraft/network/chat/SignedMessageLink;", cancellable = true)
    private void advance__1455310491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455310491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unsigned(Ljava/util/UUID;)Lnet/minecraft/network/chat/SignedMessageLink;", cancellable = true)
    private static void unsigned_1237129916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1237129916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sessionId()Ljava/util/UUID;", cancellable = true)
    private void sessionId_701191580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701191580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateSignature(Lnet/minecraft/util/SignatureUpdater$Output;)V", cancellable = true)
    private void updateSignature__1172645040(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1172645040L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDescendantOf(Lnet/minecraft/network/chat/SignedMessageLink;)Z", cancellable = true)
    private void isDescendantOf__1796611107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1796611107L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sender()Ljava/util/UUID;", cancellable = true)
    private void sender_1297110912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1297110912L))
            info.setReturnValue(null);
    }


}
