package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.SculkPatchFeature.class)
public class SculkPatchFeature2121762916Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1457946644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457946644L))
            info.setReturnValue(true);
    }


}
