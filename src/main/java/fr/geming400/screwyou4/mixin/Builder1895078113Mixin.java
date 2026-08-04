package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.ChatAbilities.Builder.class)
public class Builder1895078113Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/multiplayer/chat/ChatAbilities;", cancellable = true)
    private void build_1768056007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768056007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addRestriction(Lnet/minecraft/client/multiplayer/chat/ChatRestriction;)Lnet/minecraft/client/multiplayer/chat/ChatAbilities$Builder;", cancellable = true)
    private void addRestriction_58675845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(58675845L))
            info.setReturnValue(null);
    }


}
