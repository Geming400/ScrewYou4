package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.SpeleothemClusterFeature.class)
public class SpeleothemClusterFeature2021333404Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1558376156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1558376156L))
            info.setReturnValue(true);
    }


}
