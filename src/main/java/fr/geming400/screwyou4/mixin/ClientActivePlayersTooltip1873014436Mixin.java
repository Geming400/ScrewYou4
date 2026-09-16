package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.tooltip.ClientActivePlayersTooltip.class)
public class ClientActivePlayersTooltip1873014436Mixin {
        @Inject(at = @At("HEAD"), method = "getWidth(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void getWidth__1891240194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1891240194L))
            info.setReturnValue(1067997740);
    }

    @Inject(at = @At("HEAD"), method = "extractImage(Lnet/minecraft/client/gui/Font;IIIILnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractImage_49306574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(49306574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void getHeight__783313781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-783313781L))
            info.setReturnValue(871420066);
    }


}
