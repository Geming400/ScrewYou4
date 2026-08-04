package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.tooltip.ClientTextTooltip.class)
public class ClientTextTooltip54139293Mixin {
        @Inject(at = @At("HEAD"), method = "getWidth(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void getWidth__916646425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-916646425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractText(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;II)V", cancellable = true)
    private void extractText_2049748799(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2049748799L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void getHeight__916646425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-916646425L))
            info.setReturnValue(null);
    }


}
