package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.OutOfMemoryScreen.class)
public class OutOfMemoryScreen_834343708Mixin {
        @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_872622290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872622290L))
            info.setReturnValue(null);
    }


}
