package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.BasaltColumnsFeature.class)
public class BasaltColumnsFeature_1756178268Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__964916676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964916676L))
            info.setReturnValue(true);
    }


}
