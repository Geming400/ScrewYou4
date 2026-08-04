package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.PlayerSkinWidget.class)
public class PlayerSkinWidget1581915356Mixin {
        @Inject(at = @At("HEAD"), method = "playDownSound(Lnet/minecraft/client/sounds/SoundManager;)V", cancellable = true)
    private void playDownSound_1328725477(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1328725477L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextFocusPath(Lnet/minecraft/client/gui/navigation/FocusNavigationEvent;)Lnet/minecraft/client/gui/ComponentPath;", cancellable = true)
    private void nextFocusPath__1920701118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1920701118L))
            info.setReturnValue(null);
    }


}
