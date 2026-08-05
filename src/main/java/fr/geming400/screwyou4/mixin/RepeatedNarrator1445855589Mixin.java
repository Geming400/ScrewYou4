package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.realms.RepeatedNarrator.class)
public class RepeatedNarrator1445855589Mixin {
        @Inject(at = @At("HEAD"), method = "narrate(Lnet/minecraft/client/GameNarrator;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void narrate__609854633(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-609854633L))
            info.cancel();
    }


}
