package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.EndSpikeFeature.class)
public class EndSpikeFeature1490716189Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__2088993371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2088993371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpikesForLevel(Lnet/minecraft/world/level/WorldGenLevel;)Ljava/util/List;", cancellable = true)
    private static void getSpikesForLevel_327073464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(327073464L))
            info.setReturnValue(null);
    }


}
