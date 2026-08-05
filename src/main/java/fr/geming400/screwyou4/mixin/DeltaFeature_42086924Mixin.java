package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.DeltaFeature.class)
public class DeltaFeature_42086924Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_1615959276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1615959276L))
            info.setReturnValue(true);
    }


}
