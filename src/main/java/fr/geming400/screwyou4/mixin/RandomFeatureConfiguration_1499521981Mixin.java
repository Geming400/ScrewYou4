package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration.class)
public class RandomFeatureConfiguration_1499521981Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_590895712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590895712L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2025021791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2025021791L))
            info.setReturnValue("9O\uC408(Fkae,T\u44D1&z\uA8C3L\u5429REdK_:wyDHr\uB867\uB182mH>|@Tn+PDN{7w\u3633N1(i&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2056874071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2056874071L))
            info.setReturnValue(-1809051911);
    }

    @Inject(at = @At("HEAD"), method = "features()Ljava/util/List;", cancellable = true)
    private void features__703187543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-703187543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSubFeatures()Ljava/util/stream/Stream;", cancellable = true)
    private void getSubFeatures_692380714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(692380714L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultFeature()Lnet/minecraft/core/Holder;", cancellable = true)
    private void defaultFeature__66253917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-66253917L))
            info.setReturnValue(null);
    }


}
