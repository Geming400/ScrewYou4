package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.SelectWorldScreen.class)
public class SelectWorldScreen_1446519564Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_1484794302(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1484794302L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1484794302(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1484794302L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateButtonStatus(Lnet/minecraft/world/level/storage/LevelSummary;)V", cancellable = true)
    private void updateButtonStatus_1790944027(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1790944027L))
            info.cancel();
    }


}
