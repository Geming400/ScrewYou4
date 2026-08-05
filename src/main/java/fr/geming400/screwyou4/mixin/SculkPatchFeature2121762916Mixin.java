package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.SculkPatchFeature.class)
public class SculkPatchFeature2121762916Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__599332027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-599332027L))
            info.setReturnValue(true);
    }


}
