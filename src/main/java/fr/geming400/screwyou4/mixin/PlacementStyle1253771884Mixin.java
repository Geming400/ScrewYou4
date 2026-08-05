package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.StuckInBodyLayer.PlacementStyle.class)
public class PlacementStyle1253771884Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/entity/layers/StuckInBodyLayer$PlacementStyle;", cancellable = true)
    private static void values_1030142602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1030142602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/entity/layers/StuckInBodyLayer$PlacementStyle;", cancellable = true)
    private static void valueOf__1128696019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1128696019L))
            info.setReturnValue(net.minecraft.client.renderer.entity.layers.StuckInBodyLayer.PlacementStyle.ON_SURFACE);
    }


}
