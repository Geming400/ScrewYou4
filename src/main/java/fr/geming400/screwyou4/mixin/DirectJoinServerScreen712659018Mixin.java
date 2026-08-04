package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.DirectJoinServerScreen.class)
public class DirectJoinServerScreen712659018Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_750933757(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(750933757L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize__283220451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-283220451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_750933757(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(750933757L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__203976696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-203976696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__247028354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-247028354L))
            info.cancel();
    }


}
