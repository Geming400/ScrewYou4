package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.controls.KeyBindsScreen.class)
public class KeyBindsScreen1933162127Mixin {
        @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_1392655951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1392655951L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1374925527(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1374925527L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1902108496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902108496L))
            info.setReturnValue(true);
    }


}
