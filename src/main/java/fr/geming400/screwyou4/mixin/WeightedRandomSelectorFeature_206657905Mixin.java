package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.WeightedRandomSelectorFeature.class)
public class WeightedRandomSelectorFeature_206657905Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_1780530257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1780530257L))
            info.setReturnValue(true);
    }


}
