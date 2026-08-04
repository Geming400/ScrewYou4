package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.tooltip.DefaultTooltipPositioner.class)
public class DefaultTooltipPositioner_107988006Mixin {
        @Inject(at = @At("HEAD"), method = "positionTooltip(IIIIII)Lorg/joml/Vector2ic;", cancellable = true)
    private void positionTooltip__1059220182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1059220182L))
            info.setReturnValue(null);
    }


}
