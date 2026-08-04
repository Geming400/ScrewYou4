package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.BlockBlobFeature.class)
public class BlockBlobFeature_724917470Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_1440175205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1440175205L))
            info.setReturnValue(null);
    }


}
