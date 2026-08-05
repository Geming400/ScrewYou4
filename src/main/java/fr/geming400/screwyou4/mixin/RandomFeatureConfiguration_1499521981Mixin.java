package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration.class)
public class RandomFeatureConfiguration_1499521981Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1409933057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1409933057L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_364062005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(364062005L))
            info.setReturnValue("=b7+廀cLX[-頑}1> w81]ft{l6cG)곱4仹K)娶wH'QF!nFln쬙XR8ಋ*ᐑpwHдꍌxNdKhtbK");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1537784722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1537784722L))
            info.setReturnValue(412711455);
    }

    @Inject(at = @At("HEAD"), method = "features()Ljava/util/List;", cancellable = true)
    private void features__1169108500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1169108500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultFeature()Lnet/minecraft/core/Holder;", cancellable = true)
    private void defaultFeature__1246569544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1246569544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSubFeatures()Ljava/util/stream/Stream;", cancellable = true)
    private void getSubFeatures_1288815665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1288815665L))
            info.setReturnValue(null);
    }


}
