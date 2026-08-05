package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.SignedMessageValidator.KeyBased.class)
public class KeyBased1437269707Mixin {
        @Inject(at = @At("HEAD"), method = "updateAndValidate(Lnet/minecraft/network/chat/PlayerChatMessage;)Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void updateAndValidate__860269202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-860269202L))
            info.setReturnValue(null);
    }


}
