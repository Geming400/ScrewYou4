package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.GuiMessageTag.class)
public class GuiMessageTag_841609680Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__67016589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67016589L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1612033204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612033204L))
            info.setReturnValue("FW7?qrfu\u43D1!cSRO4\u3765>.7+VG\u34D5W\u958E_o\"\u8EC1y[ECW$QIs\u0A13|R\uB351\uCBA8ru4{kP}N=P9V\uFB70\u582BDQ=>\u92C9 .OeF#7zk\u2EE6ldnoR\u4CB9\"z.?^?wx=thovE\uB62F#\uAE584a&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1398961770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398961770L))
            info.setReturnValue(-204629323);
    }

    @Inject(at = @At("HEAD"), method = "system()Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private static void system__1594338368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1594338368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text__59150513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-59150513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatModified(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private static void chatModified__202705608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-202705608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatNotSecure()Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private static void chatNotSecure__1604705379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1604705379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indicatorColor()I", cancellable = true)
    private void indicatorColor__678276703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-678276703L))
            info.setReturnValue(-520445107);
    }

    @Inject(at = @At("HEAD"), method = "icon()Lnet/minecraft/client/multiplayer/chat/GuiMessageTag$Icon;", cancellable = true)
    private void icon_1688880565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1688880565L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.GuiMessageTag.Icon.CHAT_MODIFIED);
    }

    @Inject(at = @At("HEAD"), method = "systemSinglePlayer()Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private static void systemSinglePlayer__937990921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937990921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatError()Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private static void chatError__1576778881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1576778881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "logTag()Ljava/lang/String;", cancellable = true)
    private void logTag__710471026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-710471026L))
            info.setReturnValue("Msl");
    }


}
