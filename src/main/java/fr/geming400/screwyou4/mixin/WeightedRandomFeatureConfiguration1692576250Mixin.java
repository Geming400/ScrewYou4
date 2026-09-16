package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.WeightedRandomFeatureConfiguration.class)
public class WeightedRandomFeatureConfiguration1692576250Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_783949982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(783949982L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1831967521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1831967521L))
            info.setReturnValue("\u8376\u39D6`uj ZQA{6o+5KNaUZ)\u7A2Fi1\u3369\u7649`jq10\uD63FS\u350F=vEbY&ie\u9101\u6D4E_\"9\u1D17T\u827C\u82B3)k6#qcR\u021A:s!\u7BBCqFUm;f\u9E3A`\uD56Bx )\u1460Nc&se\u885CS2\uD2A9M\u215A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2045038955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2045038955L))
            info.setReturnValue(-264404909);
    }

    @Inject(at = @At("HEAD"), method = "getSubFeatures()Ljava/util/stream/Stream;", cancellable = true)
    private void getSubFeatures_885434984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(885434984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "features()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void features__387476963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-387476963L))
            info.setReturnValue(null);
    }


}
