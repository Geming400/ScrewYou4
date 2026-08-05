package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.StuckInBodyLayer.PlacementStyle.class)
public class PlacementStyle1253771884Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/entity/layers/StuckInBodyLayer$PlacementStyle;", cancellable = true)
    private static void values__2012609748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2012609748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/entity/layers/StuckInBodyLayer$PlacementStyle;", cancellable = true)
    private static void valueOf__664100091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-664100091L))
            info.setReturnValue(net.minecraft.client.renderer.entity.layers.StuckInBodyLayer.PlacementStyle.IN_CUBE);
    }


}
