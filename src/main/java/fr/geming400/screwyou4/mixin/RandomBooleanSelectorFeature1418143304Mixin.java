package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.RandomBooleanSelectorFeature.class)
public class RandomBooleanSelectorFeature1418143304Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_2133401040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2133401040L))
            info.setReturnValue(true);
    }


}
