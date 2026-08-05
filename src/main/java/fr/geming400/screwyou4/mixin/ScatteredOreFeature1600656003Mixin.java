package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.ScatteredOreFeature.class)
public class ScatteredOreFeature1600656003Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1120438940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120438940L))
            info.setReturnValue(false);
    }


}
