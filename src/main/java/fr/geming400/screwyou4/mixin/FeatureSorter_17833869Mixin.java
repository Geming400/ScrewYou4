package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.FeatureSorter.class)
public class FeatureSorter_17833869Mixin {
        @Inject(at = @At("HEAD"), method = "buildFeaturesPerStep(Ljava/util/List;Ljava/util/function/Function;Z)Ljava/util/List;", cancellable = true)
    private static void buildFeaturesPerStep__1668106209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668106209L))
            info.setReturnValue(null);
    }


}
