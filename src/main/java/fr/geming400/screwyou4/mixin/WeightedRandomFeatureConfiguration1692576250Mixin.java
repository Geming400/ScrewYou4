package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.WeightedRandomFeatureConfiguration.class)
public class WeightedRandomFeatureConfiguration1692576250Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1216878787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1216878787L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_557116275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(557116275L))
            info.setReturnValue("]0Dv;䕑F 乏vaX(4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1730838992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1730838992L))
            info.setReturnValue(-1497455211);
    }

    @Inject(at = @At("HEAD"), method = "features()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void features_1186092384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1186092384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSubFeatures()Ljava/util/stream/Stream;", cancellable = true)
    private void getSubFeatures_1481869935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1481869935L))
            info.setReturnValue(null);
    }


}
