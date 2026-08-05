package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.ChatLog.class)
public class ChatLog_2065635074Mixin {
        @Inject(at = @At("HEAD"), method = "end()I", cancellable = true)
    private void end_2103897319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103897319L))
            info.setReturnValue(-270529158);
    }

    @Inject(at = @At("HEAD"), method = "lookup(I)Lnet/minecraft/client/multiplayer/chat/LoggedChatEvent;", cancellable = true)
    private void lookup_1432501616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432501616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start()I", cancellable = true)
    private void start_2103897319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103897319L))
            info.setReturnValue(-270529158);
    }

    @Inject(at = @At("HEAD"), method = "push(Lnet/minecraft/client/multiplayer/chat/LoggedChatEvent;)V", cancellable = true)
    private void push_1950444093(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1950444093L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec(I)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1914797222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1914797222L))
            info.setReturnValue(null);
    }


}
