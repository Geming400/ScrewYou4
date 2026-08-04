package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.FossilFeature.class)
public class FossilFeature_2121197860Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1458511701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1458511701L))
            info.setReturnValue(null);
    }


}
