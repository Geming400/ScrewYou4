package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.MessageSignatureCache.class)
public class MessageSignatureCache545271011Mixin {
        @Inject(at = @At("HEAD"), method = "push(Lnet/minecraft/network/chat/SignedMessageBody;Lnet/minecraft/network/chat/MessageSignature;)V", cancellable = true)
    private void push_1901711158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1901711158L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack(Lnet/minecraft/network/chat/MessageSignature;)I", cancellable = true)
    private void pack_726521965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726521965L))
            info.setReturnValue(-395423089);
    }

    @Inject(at = @At("HEAD"), method = "unpack(I)Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void unpack__1986943187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1986943187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDefault()Lnet/minecraft/network/chat/MessageSignatureCache;", cancellable = true)
    private static void createDefault__993219878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-993219878L))
            info.setReturnValue(null);
    }


}
