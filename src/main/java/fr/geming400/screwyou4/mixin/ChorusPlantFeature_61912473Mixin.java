package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.ChorusPlantFeature.class)
public class ChorusPlantFeature_61912473Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_1635784825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1635784825L))
            info.setReturnValue(false);
    }


}
