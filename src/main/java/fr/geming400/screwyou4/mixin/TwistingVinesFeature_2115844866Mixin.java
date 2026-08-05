package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.TwistingVinesFeature.class)
public class TwistingVinesFeature_2115844866Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1463864695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1463864695L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "placeWeepingVinesColumn(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos$MutableBlockPos;III)V", cancellable = true)
    private static void placeWeepingVinesColumn_859783282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(859783282L))
            info.cancel();
    }


}
