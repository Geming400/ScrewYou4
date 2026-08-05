package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.DatapackLoadFailureScreen.class)
public class DatapackLoadFailureScreen2042676927Mixin {
        @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1453580549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1453580549L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1265410727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1265410727L))
            info.cancel();
    }


}
