package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.LoadingDotsWidget.class)
public class LoadingDotsWidget_732606820Mixin {
        @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive__1781770166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781770166L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "nextFocusPath(Lnet/minecraft/client/gui/navigation/FocusNavigationEvent;)Lnet/minecraft/client/gui/ComponentPath;", cancellable = true)
    private void nextFocusPath__958985805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-958985805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playDownSound(Lnet/minecraft/client/sounds/SoundManager;)V", cancellable = true)
    private void playDownSound__48753517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-48753517L))
            info.cancel();
    }


}
