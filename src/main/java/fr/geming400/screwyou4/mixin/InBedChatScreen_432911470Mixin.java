package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.InBedChatScreen.class)
public class InBedChatScreen_432911470Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1658926951(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1658926951L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerWokeUp()V", cancellable = true)
    private void onPlayerWokeUp_1016814867(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1016814867L))
            info.cancel();
    }


}
