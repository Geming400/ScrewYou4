package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.controls.KeyBindsList.class)
public class KeyBindsList1078619969Mixin {
        @Inject(at = @At("HEAD"), method = "resetMappingAndUpdateButtons()V", cancellable = true)
    private void resetMappingAndUpdateButtons_1116894708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1116894708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth_1116882215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116882215L))
            info.setReturnValue(-2113730284);
    }

    @Inject(at = @At("HEAD"), method = "refreshEntries()V", cancellable = true)
    private void refreshEntries_1116894708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1116894708L))
            info.cancel();
    }


}
