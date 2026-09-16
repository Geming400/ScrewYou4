package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.features.VegetationFeatures.class)
public class VegetationFeatures287304867Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap__267300850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-267300850L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "leafLitterPatchBuilder(II)Lnet/minecraft/util/random/WeightedList$Builder;", cancellable = true)
    private static void leafLitterPatchBuilder__404426267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-404426267L))
            info.setReturnValue(new net.minecraft.util.random.WeightedList.Builder());
    }

    @Inject(at = @At("HEAD"), method = "nearWaterPredicate(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/level/levelgen/placement/BlockPredicateFilter;", cancellable = true)
    private static void nearWaterPredicate_1358413884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1358413884L))
            info.setReturnValue(null);
    }


}
