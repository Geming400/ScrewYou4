package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.UnderwaterMagmaFeature.class)
public class UnderwaterMagmaFeature_263768828Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_1837641180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837641180L))
            info.setReturnValue(true);
    }


}
