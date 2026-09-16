package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.TwistingVinesFeature.class)
public class TwistingVinesFeature_2115844866Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__605250078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-605250078L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "placeWeepingVinesColumn(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos$MutableBlockPos;III)V", cancellable = true)
    private static void placeWeepingVinesColumn__834059851(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-834059851L))
            info.cancel();
    }


}
