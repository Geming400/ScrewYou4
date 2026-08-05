package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.RandomBooleanSelectorFeature.class)
public class RandomBooleanSelectorFeature1418143304Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1302951639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1302951639L))
            info.setReturnValue(false);
    }


}
