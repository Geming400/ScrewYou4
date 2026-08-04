package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.realms.RepeatedNarrator.class)
public class RepeatedNarrator1445855589Mixin {
        @Inject(at = @At("HEAD"), method = "narrate(Lnet/minecraft/client/GameNarrator;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void narrate__1195421928(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1195421928L))
            info.cancel();
    }


}
