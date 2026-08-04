package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.tooltip.TooltipRenderUtil.class)
public class TooltipRenderUtil_650692755Mixin {
        @Inject(at = @At("HEAD"), method = "extractTooltipBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIIILnet/minecraft/resources/Identifier;)V", cancellable = true)
    private static void extractTooltipBackground__525319622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-525319622L))
            info.cancel();
    }


}
