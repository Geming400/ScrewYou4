package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.SpriteIconButton.CenteredIcon.class)
public class CenteredIcon_591175109Mixin {
        @Inject(at = @At("HEAD"), method = "extractContents(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractContents__368512264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-368512264L))
            info.cancel();
    }


}
