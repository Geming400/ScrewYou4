package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.packs.PackSelectionScreen.class)
public class PackSelectionScreen_859190415Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_897465153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(897465153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_897465153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(897465153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onFilesDrop(Ljava/util/List;)V", cancellable = true)
    private void onFilesDrop_79971826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(79971826L))
            info.cancel();
    }


}
