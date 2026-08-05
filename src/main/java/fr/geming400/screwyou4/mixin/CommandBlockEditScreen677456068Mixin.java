package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.CommandBlockEditScreen.class)
public class CommandBlockEditScreen677456068Mixin {
        @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize__440160413(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-440160413L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateGui()V", cancellable = true)
    private void updateGui_176549637(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(176549637L))
            info.cancel();
    }


}
