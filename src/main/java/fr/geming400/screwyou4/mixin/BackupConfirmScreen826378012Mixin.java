package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.BackupConfirmScreen.class)
public class BackupConfirmScreen826378012Mixin {
        @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__90257702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-90257702L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__133309360(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-133309360L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_864656595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(864656595L))
            info.setReturnValue(true);
    }


}
