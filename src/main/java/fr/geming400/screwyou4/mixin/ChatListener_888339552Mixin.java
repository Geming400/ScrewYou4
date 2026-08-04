package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.ChatListener.class)
public class ChatListener_888339552Mixin {
        @Inject(at = @At("HEAD"), method = "queueSize()J", cancellable = true)
    private void queueSize_926602758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(926602758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_926614290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(926614290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleOverlay(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void handleOverlay__1012839386(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1012839386L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMessageDelay(D)V", cancellable = true)
    private void setMessageDelay_2097638918(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2097638918L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "flushQueue()V", cancellable = true)
    private void flushQueue_926614290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(926614290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acceptNextDelayedMessage()V", cancellable = true)
    private void acceptNextDelayedMessage_926614290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(926614290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeFromDelayedMessageQueue(Lnet/minecraft/network/chat/MessageSignature;)Z", cancellable = true)
    private void removeFromDelayedMessageQueue_1069606842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069606842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleSystemMessage(Lnet/minecraft/network/chat/Component;Z)V", cancellable = true)
    private void handleSystemMessage_2124434568(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2124434568L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDisguisedChatMessage(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void handleDisguisedChatMessage__768949241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-768949241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerChatMessage(Lnet/minecraft/network/chat/PlayerChatMessage;Lcom/mojang/authlib/GameProfile;Lnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void handlePlayerChatMessage__921535425(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-921535425L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChatMessageError(Ljava/util/UUID;Lnet/minecraft/network/chat/MessageSignature;Lnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void handleChatMessageError_878394187(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(878394187L))
            info.cancel();
    }


}
