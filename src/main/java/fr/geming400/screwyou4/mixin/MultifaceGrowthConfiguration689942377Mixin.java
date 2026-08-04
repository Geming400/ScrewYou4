package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.MultifaceGrowthConfiguration.class)
public class MultifaceGrowthConfiguration689942377Mixin {
        @Inject(at = @At("HEAD"), method = "getShuffledDirectionsExcept(Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/Direction;)Ljava/util/List;", cancellable = true)
    private void getShuffledDirectionsExcept__587650963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-587650963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShuffledDirections(Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private void getShuffledDirections_646425593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646425593L))
            info.setReturnValue(null);
    }


}
