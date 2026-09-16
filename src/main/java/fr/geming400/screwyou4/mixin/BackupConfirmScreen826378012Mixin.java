package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.BackupConfirmScreen.class)
public class BackupConfirmScreen826378012Mixin {
        @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_795324381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(795324381L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_237281634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(237281634L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1813257654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1813257654L))
            info.cancel();
    }


}
