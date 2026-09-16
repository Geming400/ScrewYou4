package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.controls.KeyBindsList.class)
public class KeyBindsList1078619969Mixin {
        @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth__714601243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714601243L))
            info.setReturnValue(612193682);
    }

    @Inject(at = @At("HEAD"), method = "refreshEntries()V", cancellable = true)
    private void refreshEntries__815414817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-815414817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetMappingAndUpdateButtons()V", cancellable = true)
    private void resetMappingAndUpdateButtons_1049136500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1049136500L))
            info.cancel();
    }


}
