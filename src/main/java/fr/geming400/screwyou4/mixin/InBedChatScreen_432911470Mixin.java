package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.InBedChatScreen.class)
public class InBedChatScreen_432911470Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_471186208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(471186208L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerWokeUp()V", cancellable = true)
    private void onPlayerWokeUp_471186208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(471186208L))
            info.cancel();
    }


}
