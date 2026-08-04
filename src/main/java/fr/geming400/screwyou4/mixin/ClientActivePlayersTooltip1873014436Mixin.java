package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.tooltip.ClientActivePlayersTooltip.class)
public class ClientActivePlayersTooltip1873014436Mixin {
        @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void getHeight_902228718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902228718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void getWidth_902228718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902228718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractImage(Lnet/minecraft/client/gui/Font;IIIILnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractImage_1551332968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1551332968L))
            info.cancel();
    }


}
