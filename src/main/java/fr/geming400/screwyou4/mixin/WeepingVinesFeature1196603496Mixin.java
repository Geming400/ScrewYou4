package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.WeepingVinesFeature.class)
public class WeepingVinesFeature1196603496Mixin {
        @Inject(at = @At("HEAD"), method = "placeWeepingVinesColumn(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos$MutableBlockPos;III)V", cancellable = true)
    private static void placeWeepingVinesColumn__1753301220(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1753301220L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1524491447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1524491447L))
            info.setReturnValue(true);
    }


}
