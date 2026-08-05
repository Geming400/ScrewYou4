package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.BiomeGenerationSettings.class)
public class BiomeGenerationSettings942296621Mixin {
        @Inject(at = @At("HEAD"), method = "features()Ljava/util/List;", cancellable = true)
    private void features__1726333859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726333859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasFeature(Lnet/minecraft/world/level/levelgen/placement/PlacedFeature;)Z", cancellable = true)
    private void hasFeature_581955403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(581955403L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBoneMealFeatures()Ljava/util/List;", cancellable = true)
    private void getBoneMealFeatures__1726333859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726333859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCarvers()Ljava/lang/Iterable;", cancellable = true)
    private void getCarvers__1067453067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1067453067L))
            info.setReturnValue(null);
    }


}
