package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.SubtitleOverlay.class)
public class SubtitleOverlay_1613193814Mixin {
        @Inject(at = @At("HEAD"), method = "onPlaySound(Lnet/minecraft/client/resources/sounds/SoundInstance;Lnet/minecraft/client/sounds/WeighedSoundEvents;F)V", cancellable = true)
    private void onPlaySound__44433225(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-44433225L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractRenderState_1476938135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1476938135L))
            info.cancel();
    }


}
