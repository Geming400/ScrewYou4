package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.WorldOptionsScreen.class)
public class WorldOptionsScreen_166951616Mixin {
        @Inject(at = @At("HEAD"), method = "added()V", cancellable = true)
    private void added__1539686286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1539686286L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1392967097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1392967097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGamemasterPermissionChanged(Z)V", cancellable = true)
    private void onGamemasterPermissionChanged__833230322(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-833230322L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDifficultyChanged()V", cancellable = true)
    private void onDifficultyChanged_1438495576(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1438495576L))
            info.cancel();
    }


}
