package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.SimpleRandomSelectorFeature.class)
public class SimpleRandomSelectorFeature_1782659308Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1797050253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797050253L))
            info.setReturnValue(null);
    }


}
