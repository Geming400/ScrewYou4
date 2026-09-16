package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.MessageSignatureCache.class)
public class MessageSignatureCache545271011Mixin {
        @Inject(at = @At("HEAD"), method = "push(Lnet/minecraft/network/chat/SignedMessageBody;Lnet/minecraft/network/chat/MessageSignature;)V", cancellable = true)
    private void push_381011536(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(381011536L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack(Lnet/minecraft/network/chat/MessageSignature;)I", cancellable = true)
    private void pack_276537926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(276537926L))
            info.setReturnValue(1373661534);
    }

    @Inject(at = @At("HEAD"), method = "unpack(I)Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void unpack__1093668129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093668129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDefault()Lnet/minecraft/network/chat/MessageSignatureCache;", cancellable = true)
    private static void createDefault__779233601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779233601L))
            info.setReturnValue(null);
    }


}
