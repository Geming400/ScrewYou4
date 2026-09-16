package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.BiomeGenerationSettings.class)
public class BiomeGenerationSettings942296621Mixin {
        @Inject(at = @At("HEAD"), method = "features()Ljava/util/List;", cancellable = true)
    private void features__1260412902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1260412902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasFeature(Lnet/minecraft/world/level/levelgen/placement/PlacedFeature;)Z", cancellable = true)
    private void hasFeature__160731185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-160731185L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCarvers()Ljava/lang/Iterable;", cancellable = true)
    private void getCarvers__1512191421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1512191421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBoneMealFeatures()Ljava/util/List;", cancellable = true)
    private void getBoneMealFeatures_659330263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659330263L))
            info.setReturnValue(null);
    }


}
