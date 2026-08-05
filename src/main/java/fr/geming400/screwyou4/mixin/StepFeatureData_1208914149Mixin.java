package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.FeatureSorter.StepFeatureData.class)
public class StepFeatureData_1208914149Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1700540889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1700540889L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_73454173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73454173L))
            info.setReturnValue("E,o_Hp{r⿂'l攩\"⡆&uCz}?_fyUO;;硫jZEelW'R償ﲘP1_V+CC1zꡛ䫇");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1247176890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247176890L))
            info.setReturnValue(-346250061);
    }

    @Inject(at = @At("HEAD"), method = "features()Ljava/util/List;", cancellable = true)
    private void features__1459716332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1459716332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indexMapping()Ljava/util/function/ToIntFunction;", cancellable = true)
    private void indexMapping__609699875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609699875L))
            info.setReturnValue(null);
    }


}
