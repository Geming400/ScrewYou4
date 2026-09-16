package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.GuiMessage.class)
public class GuiMessage_827247088Mixin {
        @Inject(at = @At("HEAD"), method = "signature()Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void signature_559301512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(559301512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__81379181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81379181L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1597670612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1597670612L))
            info.setReturnValue("`L^\":_ho\u7EBEc\uD0609{\u96EBy \u0242'%Ztd^\"n;n61$fBxRKu:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1384599178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384599178L))
            info.setReturnValue(689070194);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/client/multiplayer/chat/GuiMessageSource;", cancellable = true)
    private void source_285201087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285201087L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.GuiMessageSource.SYSTEM_SERVER);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private void tag__773511203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773511203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "content()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void content__1175365701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1175365701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "splitLines(Lnet/minecraft/client/gui/Font;I)Ljava/util/List;", cancellable = true)
    private void splitLines_1609904239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1609904239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addedTime()I", cancellable = true)
    private void addedTime__1806801912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1806801912L))
            info.setReturnValue(836610572);
    }


}
