package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.controls.KeyBindsScreen.class)
public class KeyBindsScreen1933162127Mixin {
        @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1016526413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1016526413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_973474755(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(973474755L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_318503249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(318503249L))
            info.setReturnValue(null);
    }


}
