package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.stateproviders.NoiseThresholdProvider.class)
public class NoiseThresholdProvider_906385526Mixin {
        @Inject(at = @At("HEAD"), method = "getState(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getState_1270689826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1270689826L))
            info.setReturnValue(null);
    }


}
