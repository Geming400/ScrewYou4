package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.WorldOptionsScreen.class)
public class WorldOptionsScreen_166951616Mixin {
        @Inject(at = @At("HEAD"), method = "added()V", cancellable = true)
    private void added_205226354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(205226354L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_205226354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(205226354L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGamemasterPermissionChanged(Z)V", cancellable = true)
    private void onGamemasterPermissionChanged_1396568444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1396568444L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDifficultyChanged()V", cancellable = true)
    private void onDifficultyChanged_205226354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(205226354L))
            info.cancel();
    }


}
