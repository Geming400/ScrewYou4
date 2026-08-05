package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.SoundPreviewHandler.class)
public class SoundPreviewHandler141676243Mixin {
        @Inject(at = @At("HEAD"), method = "preview(Lnet/minecraft/client/sounds/SoundManager;Lnet/minecraft/sounds/SoundSource;F)V", cancellable = true)
    private static void preview_599479370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(599479370L))
            info.cancel();
    }


}
