package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.BlockPileFeature.class)
public class BlockPileFeature_418494163Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_1133751898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1133751898L))
            info.setReturnValue(null);
    }


}
