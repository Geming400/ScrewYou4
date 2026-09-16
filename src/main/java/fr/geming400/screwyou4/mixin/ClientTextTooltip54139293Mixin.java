package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.tooltip.ClientTextTooltip.class)
public class ClientTextTooltip54139293Mixin {
        @Inject(at = @At("HEAD"), method = "getWidth(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void getWidth_584851959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(584851959L))
            info.setReturnValue(759653849);
    }

    @Inject(at = @At("HEAD"), method = "extractText(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;II)V", cancellable = true)
    private void extractText__1580814671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1580814671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void getHeight_1692778372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692778372L))
            info.setReturnValue(-1613876906);
    }


}
