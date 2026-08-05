package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.SignedMessageLink.class)
public class SignedMessageLink_1177878457Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1216140702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1216140702L))
            info.setReturnValue(-127428650);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1731576581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1731576581L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_42418481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(42418481L))
            info.setReturnValue("S蕵}MAZ[劘q`輢E6[ZNz.㿶1&AbQQf죘bU^ovㅋiC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1216141198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1216141198L))
            info.setReturnValue(-330576069);
    }

    @Inject(at = @At("HEAD"), method = "root(Ljava/util/UUID;Ljava/util/UUID;)Lnet/minecraft/network/chat/SignedMessageLink;", cancellable = true)
    private static void root_594131891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(594131891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "advance()Lnet/minecraft/network/chat/SignedMessageLink;", cancellable = true)
    private void advance__238488221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-238488221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unsigned(Ljava/util/UUID;)Lnet/minecraft/network/chat/SignedMessageLink;", cancellable = true)
    private static void unsigned__701053689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-701053689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sessionId()Ljava/util/UUID;", cancellable = true)
    private void sessionId_1589012939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589012939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateSignature(Lnet/minecraft/util/SignatureUpdater$Output;)V", cancellable = true)
    private void updateSignature__335481505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-335481505L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sender()Ljava/util/UUID;", cancellable = true)
    private void sender_1589012939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589012939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDescendantOf(Lnet/minecraft/network/chat/SignedMessageLink;)Z", cancellable = true)
    private void isDescendantOf__308406629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-308406629L))
            info.setReturnValue(true);
    }


}
