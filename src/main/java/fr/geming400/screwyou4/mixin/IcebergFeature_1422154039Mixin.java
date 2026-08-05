package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.IcebergFeature.class)
public class IcebergFeature_1422154039Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1298940905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1298940905L))
            info.setReturnValue(false);
    }


}
