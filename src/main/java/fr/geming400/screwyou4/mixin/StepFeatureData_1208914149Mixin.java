package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.FeatureSorter.StepFeatureData.class)
public class StepFeatureData_1208914149Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_300287880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(300287880L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1979337673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1979337673L))
            info.setReturnValue("B]<FK_MQp/\uAC01<fY\"\u93FFqu");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1766266239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766266239L))
            info.setReturnValue(-1901072600);
    }

    @Inject(at = @At("HEAD"), method = "indexMapping()Ljava/util/function/ToIntFunction;", cancellable = true)
    private void indexMapping__2037810567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2037810567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "features()Ljava/util/List;", cancellable = true)
    private void features__993795375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-993795375L))
            info.setReturnValue(null);
    }


}
