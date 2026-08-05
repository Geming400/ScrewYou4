package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.HugeFungusFeature.class)
public class HugeFungusFeature1045834583Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1675260360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1675260360L))
            info.setReturnValue(false);
    }


}
