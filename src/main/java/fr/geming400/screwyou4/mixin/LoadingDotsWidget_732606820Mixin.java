package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.LoadingDotsWidget.class)
public class LoadingDotsWidget_732606820Mixin {
        @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive_770885402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(770885402L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "playDownSound(Lnet/minecraft/client/sounds/SoundManager;)V", cancellable = true)
    private void playDownSound_479416940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(479416940L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextFocusPath(Lnet/minecraft/client/gui/navigation/FocusNavigationEvent;)Lnet/minecraft/client/gui/ComponentPath;", cancellable = true)
    private void nextFocusPath_1524957641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1524957641L))
            info.setReturnValue(null);
    }


}
