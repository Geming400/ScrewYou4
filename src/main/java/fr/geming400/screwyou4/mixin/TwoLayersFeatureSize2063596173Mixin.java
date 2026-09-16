package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize.class)
public class TwoLayersFeatureSize2063596173Mixin {
        @Inject(at = @At("HEAD"), method = "getSizeAtHeight(II)I", cancellable = true)
    private void getSizeAtHeight__83335774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-83335774L))
            info.setReturnValue(2040757588);
    }


}
