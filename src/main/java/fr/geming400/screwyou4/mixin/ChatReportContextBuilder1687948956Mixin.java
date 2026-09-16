package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ChatReportContextBuilder.class)
public class ChatReportContextBuilder1687948956Mixin {
        @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive__826428029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-826428029L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "collectAllContext(Lnet/minecraft/client/multiplayer/chat/ChatLog;Lit/unimi/dsi/fastutil/ints/IntCollection;Lnet/minecraft/client/multiplayer/chat/report/ChatReportContextBuilder$Handler;)V", cancellable = true)
    private void collectAllContext__520530318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-520530318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acceptContext(Lnet/minecraft/network/chat/PlayerChatMessage;)Z", cancellable = true)
    private void acceptContext_221670447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(221670447L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "trackContext(Lnet/minecraft/network/chat/PlayerChatMessage;)V", cancellable = true)
    private void trackContext_943206318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(943206318L))
            info.cancel();
    }


}
