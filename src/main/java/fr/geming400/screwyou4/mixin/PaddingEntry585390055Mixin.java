package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ChatSelectionScreen.ChatSelectionList.PaddingEntry.class)
public class PaddingEntry585390055Mixin {
        @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_1497065115(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1497065115L))
            info.cancel();
    }


}
