package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.DirectJoinServerScreen.class)
public class DirectJoinServerScreen712659018Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_273578653(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(273578653L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize__404957463(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-404957463L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1938674500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1938674500L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1699538660(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1699538660L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_681605387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(681605387L))
            info.setReturnValue(true);
    }


}
