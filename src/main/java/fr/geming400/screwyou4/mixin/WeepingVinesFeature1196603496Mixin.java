package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.WeepingVinesFeature.class)
public class WeepingVinesFeature1196603496Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_1911861232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911861232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeWeepingVinesColumn(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos$MutableBlockPos;III)V", cancellable = true)
    private static void placeWeepingVinesColumn__59458087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-59458087L))
            info.cancel();
    }


}
