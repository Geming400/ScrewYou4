package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.flag.FeatureFlagRegistry.class)
public class FeatureFlagRegistry1043047089Mixin {
        @Inject(at = @At("HEAD"), method = "subset([Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void subset__1932431185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1932431185L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__761662451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-761662451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allFlags()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void allFlags_472689181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(472689181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSubset(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isSubset_561209593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561209593L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fromNames(Ljava/lang/Iterable;Ljava/util/function/Consumer;)Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void fromNames__1859381758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1859381758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromNames(Ljava/lang/Iterable;)Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void fromNames__1529736946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1529736946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toNames(Lnet/minecraft/world/flag/FeatureFlagSet;)Ljava/util/Set;", cancellable = true)
    private void toNames__195006011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-195006011L))
            info.setReturnValue(null);
    }


}
