package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.SignedMessageChain.class)
public class SignedMessageChain1480170896Mixin {
        @Inject(at = @At("HEAD"), method = "encoder(Lnet/minecraft/util/Signer;)Lnet/minecraft/network/chat/SignedMessageChain$Encoder;", cancellable = true)
    private void encoder_432203864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432203864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decoder(Lnet/minecraft/world/entity/player/ProfilePublicKey;)Lnet/minecraft/network/chat/SignedMessageChain$Decoder;", cancellable = true)
    private void decoder__807699701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-807699701L))
            info.setReturnValue(null);
    }


}
