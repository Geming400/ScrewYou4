package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.tooltip.BelowOrAboveWidgetTooltipPositioner.class)
public class BelowOrAboveWidgetTooltipPositioner2003299294Mixin {
        @Inject(at = @At("HEAD"), method = "positionTooltip(IIIIII)Lorg/joml/Vector2ic;", cancellable = true)
    private void positionTooltip_836091107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(836091107L))
            info.setReturnValue(null);
    }


}
