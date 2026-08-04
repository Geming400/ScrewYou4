package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.PlayerChatMessage.class)
public class PlayerChatMessage_911433200Mixin {
        @Inject(at = @At("HEAD"), method = "signature()Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void signature__333051584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-333051584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1998021838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1998021838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__224026776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-224026776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_949695941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949695941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filter(Z)Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void filter__1894186201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1894186201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filter(Lnet/minecraft/network/chat/FilterMask;)Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void filter_1173568928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173568928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "system(Ljava/lang/String;)Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private static void system__534030305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-534030305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verify(Lnet/minecraft/util/SignatureValidator;)Z", cancellable = true)
    private void verify__1455748150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455748150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unsigned(Ljava/util/UUID;Ljava/lang/String;)Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private static void unsigned__1401203765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1401203765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "link()Lnet/minecraft/network/chat/SignedMessageLink;", cancellable = true)
    private void link__504933478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-504933478L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSystem()Z", cancellable = true)
    private void isSystem_949711782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949711782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "salt()J", cancellable = true)
    private void salt_949696406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949696406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateSignature(Lnet/minecraft/util/SignatureUpdater$Output;Lnet/minecraft/network/chat/SignedMessageLink;Lnet/minecraft/network/chat/SignedMessageBody;)V", cancellable = true)
    private static void updateSignature__1206283458(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1206283458L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasSignature()Z", cancellable = true)
    private void hasSignature_949711782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949711782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeSignature()Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void removeSignature__835065103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-835065103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "describeSigned(Lnet/minecraft/network/chat/PlayerChatMessage;)Ljava/lang/String;", cancellable = true)
    private static void describeSigned__629572083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-629572083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sender()Ljava/util/UUID;", cancellable = true)
    private void sender_1322567682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1322567682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeStamp()Ljava/time/Instant;", cancellable = true)
    private void timeStamp_2008667399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008667399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unsignedContent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void unsignedContent__1265475966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265475966L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasExpiredClient(Ljava/time/Instant;)Z", cancellable = true)
    private void hasExpiredClient_315225233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315225233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "signedContent()Ljava/lang/String;", cancellable = true)
    private void signedContent__224027272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-224027272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeUnsignedContent()Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void removeUnsignedContent__835065103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-835065103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decoratedContent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void decoratedContent__1265475966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265475966L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFullyFiltered()Z", cancellable = true)
    private void isFullyFiltered_949711782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949711782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasSignatureFrom(Ljava/util/UUID;)Z", cancellable = true)
    private void hasSignatureFrom_553880954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(553880954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filterMask()Lnet/minecraft/network/chat/FilterMask;", cancellable = true)
    private void filterMask_581137677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(581137677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "signedBody()Lnet/minecraft/network/chat/SignedMessageBody;", cancellable = true)
    private void signedBody__627078926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-627078926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasExpiredServer(Ljava/time/Instant;)Z", cancellable = true)
    private void hasExpiredServer_315225233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315225233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withUnsignedContent(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void withUnsignedContent__1001565603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1001565603L))
            info.setReturnValue(null);
    }


}
