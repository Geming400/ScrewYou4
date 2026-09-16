package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.PlayerSkinWidget.class)
public class PlayerSkinWidget1581915356Mixin {
        @Inject(at = @At("HEAD"), method = "nextFocusPath(Lnet/minecraft/client/gui/navigation/FocusNavigationEvent;)Lnet/minecraft/client/gui/ComponentPath;", cancellable = true)
    private void nextFocusPath__109677268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109677268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playDownSound(Lnet/minecraft/client/sounds/SoundManager;)V", cancellable = true)
    private void playDownSound_800555020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(800555020L))
            info.cancel();
    }


}
