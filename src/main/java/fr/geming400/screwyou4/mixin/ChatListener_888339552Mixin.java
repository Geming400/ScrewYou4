package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.ChatListener.class)
public class ChatListener_888339552Mixin {
        @Inject(at = @At("HEAD"), method = "queueSize()J", cancellable = true)
    private void queueSize__231376748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-231376748L))
            info.setReturnValue(-1357807763859090555L);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_758655893(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(758655893L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMessageDelay(D)V", cancellable = true)
    private void setMessageDelay__883176764(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-883176764L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acceptNextDelayedMessage()V", cancellable = true)
    private void acceptNextDelayedMessage__1677646382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1677646382L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeFromDelayedMessageQueue(Lnet/minecraft/network/chat/MessageSignature;)Z", cancellable = true)
    private void removeFromDelayedMessageQueue__360525096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-360525096L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleChatMessageError(Ljava/util/UUID;Lnet/minecraft/network/chat/MessageSignature;Lnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void handleChatMessageError__461308694(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-461308694L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDisguisedChatMessage(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void handleDisguisedChatMessage__1411041831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1411041831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerChatMessage(Lnet/minecraft/network/chat/PlayerChatMessage;Lcom/mojang/authlib/GameProfile;Lnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void handlePlayerChatMessage__1783714715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1783714715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSystemMessage(Lnet/minecraft/network/chat/Component;Z)V", cancellable = true)
    private void handleSystemMessage__1398056424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1398056424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleOverlay(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void handleOverlay__1143060962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1143060962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "flushQueue()V", cancellable = true)
    private void flushQueue_633147077(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(633147077L))
            info.cancel();
    }


}
