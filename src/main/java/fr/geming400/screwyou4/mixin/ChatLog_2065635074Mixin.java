package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.ChatLog.class)
public class ChatLog_2065635074Mixin {
        @Inject(at = @At("HEAD"), method = "end()I", cancellable = true)
    private void end__556813076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-556813076L))
            info.setReturnValue(110256598);
    }

    @Inject(at = @At("HEAD"), method = "lookup(I)Lnet/minecraft/client/multiplayer/chat/LoggedChatEvent;", cancellable = true)
    private void lookup__998186006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-998186006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start()I", cancellable = true)
    private void start_439457221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439457221L))
            info.setReturnValue(141410515);
    }

    @Inject(at = @At("HEAD"), method = "push(Lnet/minecraft/client/multiplayer/chat/LoggedChatEvent;)V", cancellable = true)
    private void push_1730143831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1730143831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec(I)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1069408848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069408848L))
            info.setReturnValue(null);
    }


}
