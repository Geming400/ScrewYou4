package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.MultifaceGrowthConfiguration.class)
public class MultifaceGrowthConfiguration689942377Mixin {
        @Inject(at = @At("HEAD"), method = "getShuffledDirections(Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private void getShuffledDirections__943946396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943946396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShuffledDirectionsExcept(Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/Direction;)Ljava/util/List;", cancellable = true)
    private void getShuffledDirectionsExcept__1519953281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519953281L))
            info.setReturnValue(null);
    }


}
