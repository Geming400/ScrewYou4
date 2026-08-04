package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.CommandBlockEditScreen.class)
public class CommandBlockEditScreen677456068Mixin {
        @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize__318423401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-318423401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateGui()V", cancellable = true)
    private void updateGui_715730807(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(715730807L))
            info.cancel();
    }


}
