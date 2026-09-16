package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.PlayerChatMessage.class)
public class PlayerChatMessage_911433200Mixin {
        @Inject(at = @At("HEAD"), method = "signature()Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void signature_643487624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(643487624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2806931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2806931L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1681856724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681856724L))
            info.setReturnValue("P\u3F81N\u6D55F^\u02E8o%\u25CA`AQm?:,:[\u7332\uC0E09 Gc0nNMuN.k\u3F31^3Z\u81E6\uA3CD\u4D0F\uA811 4sgs\u43FC\"}H1cFC3zZOL(%v\u3147d>=D=*$Ak\uFBA2<[#r)DP21VnP):f");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1468785290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1468785290L))
            info.setReturnValue(1350278004);
    }

    @Inject(at = @At("HEAD"), method = "filter(Z)Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void filter_1845671087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1845671087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filter(Lnet/minecraft/network/chat/FilterMask;)Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void filter_563317032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(563317032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "system(Ljava/lang/String;)Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private static void system_2099782350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2099782350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verify(Lnet/minecraft/util/SignatureValidator;)Z", cancellable = true)
    private void verify__978615613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978615613L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "unsigned(Ljava/util/UUID;Ljava/lang/String;)Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private static void unsigned__2039642560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2039642560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "link()Lnet/minecraft/network/chat/SignedMessageLink;", cancellable = true)
    private void link__1060417260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1060417260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSystem()Z", cancellable = true)
    private void isSystem__2086755507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2086755507L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "salt()J", cancellable = true)
    private void salt_1186872576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1186872576L))
            info.setReturnValue(-7419650807132590888L);
    }

    @Inject(at = @At("HEAD"), method = "updateSignature(Lnet/minecraft/util/SignatureUpdater$Output;Lnet/minecraft/network/chat/SignedMessageLink;Lnet/minecraft/network/chat/SignedMessageBody;)V", cancellable = true)
    private static void updateSignature_247729583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(247729583L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "timeStamp()Ljava/time/Instant;", cancellable = true)
    private void timeStamp__1607211183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1607211183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasSignature()Z", cancellable = true)
    private void hasSignature_1752651560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1752651560L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "filterMask()Lnet/minecraft/network/chat/FilterMask;", cancellable = true)
    private void filterMask_1308934153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1308934153L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "signedBody()Lnet/minecraft/network/chat/SignedMessageBody;", cancellable = true)
    private void signedBody__1372847024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1372847024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasExpiredServer(Ljava/time/Instant;)Z", cancellable = true)
    private void hasExpiredServer__396057377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-396057377L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "removeSignature()Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void removeSignature__1940639099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940639099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "describeSigned(Lnet/minecraft/network/chat/PlayerChatMessage;)Ljava/lang/String;", cancellable = true)
    private static void describeSigned_1013258324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013258324L))
            info.setReturnValue("\"\u444Bj7EMi_\u483Bns#D]enJ.--C^f'\uB834N}AHkZZo");
    }

    @Inject(at = @At("HEAD"), method = "sender()Ljava/util/UUID;", cancellable = true)
    private void sender_1030665655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1030665655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withUnsignedContent(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void withUnsignedContent_1165206139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1165206139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasSignatureFrom(Ljava/util/UUID;)Z", cancellable = true)
    private void hasSignatureFrom__1391119758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1391119758L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "decoratedContent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void decoratedContent_119766404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(119766404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "signedContent()Ljava/lang/String;", cancellable = true)
    private void signedContent__1578473611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1578473611L))
            info.setReturnValue("B?\uCDD9<W=yO@\u429Dfnb*hLm\u3DC0\u5109XE:29");
    }

    @Inject(at = @At("HEAD"), method = "unsignedContent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void unsignedContent_1472397638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1472397638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFullyFiltered()Z", cancellable = true)
    private void isFullyFiltered_992893711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(992893711L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasExpiredClient(Ljava/time/Instant;)Z", cancellable = true)
    private void hasExpiredClient__770551449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-770551449L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "removeUnsignedContent()Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void removeUnsignedContent__1183530607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1183530607L))
            info.setReturnValue(null);
    }


}
