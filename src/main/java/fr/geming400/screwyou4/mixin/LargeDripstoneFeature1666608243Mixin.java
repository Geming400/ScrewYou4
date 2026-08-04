package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.LargeDripstoneFeature.class)
public class LargeDripstoneFeature1666608243Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1913101317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1913101317L))
            info.setReturnValue(null);
    }


}
