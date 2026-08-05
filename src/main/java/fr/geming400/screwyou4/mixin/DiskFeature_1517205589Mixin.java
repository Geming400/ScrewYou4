package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.DiskFeature.class)
public class DiskFeature_1517205589Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1203889355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203889355L))
            info.setReturnValue(true);
    }


}
