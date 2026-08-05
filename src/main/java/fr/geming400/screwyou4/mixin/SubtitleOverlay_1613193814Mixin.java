package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.SubtitleOverlay.class)
public class SubtitleOverlay_1613193814Mixin {
        @Inject(at = @At("HEAD"), method = "onPlaySound(Lnet/minecraft/client/resources/sounds/SoundInstance;Lnet/minecraft/client/sounds/WeighedSoundEvents;F)V", cancellable = true)
    private void onPlaySound__883497645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-883497645L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractRenderState_925278525(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(925278525L))
            info.cancel();
    }


}
