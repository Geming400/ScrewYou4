package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.tooltip.MenuTooltipPositioner.class)
public class MenuTooltipPositioner_1610911508Mixin {
        @Inject(at = @At("HEAD"), method = "positionTooltip(IIIIII)Lorg/joml/Vector2ic;", cancellable = true)
    private void positionTooltip__97110734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-97110734L))
            info.setReturnValue(null);
    }


}
