package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize.class)
public class ThreeLayersFeatureSize_1610688581Mixin {
        @Inject(at = @At("HEAD"), method = "getSizeAtHeight(II)I", cancellable = true)
    private void getSizeAtHeight__536243367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536243367L))
            info.setReturnValue(1313924283);
    }


}
