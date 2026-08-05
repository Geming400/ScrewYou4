package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.BasaltPillarFeature.class)
public class BasaltPillarFeature_1149888279Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_1865146014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1865146014L))
            info.setReturnValue(true);
    }


}
