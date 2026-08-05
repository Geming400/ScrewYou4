package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.SeagrassFeature.class)
public class SeagrassFeature241698497Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_1815570850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1815570850L))
            info.setReturnValue(false);
    }


}
