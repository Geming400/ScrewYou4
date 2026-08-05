package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ChatReportContextBuilder.class)
public class ChatReportContextBuilder1687948956Mixin {
        @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive_1726227539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1726227539L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "acceptContext(Lnet/minecraft/network/chat/PlayerChatMessage;)Z", cancellable = true)
    private void acceptContext_772752150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(772752150L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "trackContext(Lnet/minecraft/network/chat/PlayerChatMessage;)V", cancellable = true)
    private void trackContext_772748306(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(772748306L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "collectAllContext(Lnet/minecraft/client/multiplayer/chat/ChatLog;Lit/unimi/dsi/fastutil/ints/IntCollection;Lnet/minecraft/client/multiplayer/chat/report/ChatReportContextBuilder$Handler;)V", cancellable = true)
    private void collectAllContext__1061724918(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1061724918L))
            info.cancel();
    }


}
