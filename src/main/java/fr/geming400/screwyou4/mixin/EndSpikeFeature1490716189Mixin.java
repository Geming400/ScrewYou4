package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.EndSpikeFeature.class)
public class EndSpikeFeature1490716189Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1230378754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1230378754L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSpikesForLevel(Lnet/minecraft/world/level/WorldGenLevel;)Ljava/util/List;", cancellable = true)
    private static void getSpikesForLevel__1048316422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1048316422L))
            info.setReturnValue(null);
    }


}
