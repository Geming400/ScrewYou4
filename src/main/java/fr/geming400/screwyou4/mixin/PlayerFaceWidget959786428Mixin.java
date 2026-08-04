package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.PlayerFaceWidget.class)
public class PlayerFaceWidget959786428Mixin {
        @Inject(at = @At("HEAD"), method = "playDownSound(Lnet/minecraft/client/sounds/SoundManager;)V", cancellable = true)
    private void playDownSound_706596549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(706596549L))
            info.cancel();
    }


}
