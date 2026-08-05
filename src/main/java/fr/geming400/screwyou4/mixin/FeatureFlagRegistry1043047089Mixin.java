package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.flag.FeatureFlagRegistry.class)
public class FeatureFlagRegistry1043047089Mixin {
        @Inject(at = @At("HEAD"), method = "subset([Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void subset__842690675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-842690675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_651081463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(651081463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allFlags()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void allFlags_1707867587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1707867587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toNames(Lnet/minecraft/world/flag/FeatureFlagSet;)Ljava/util/Set;", cancellable = true)
    private void toNames__815080008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-815080008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSubset(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isSubset__386722291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-386722291L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fromNames(Ljava/lang/Iterable;Ljava/util/function/Consumer;)Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void fromNames_2066685124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2066685124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromNames(Ljava/lang/Iterable;)Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void fromNames_2058941196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2058941196L))
            info.setReturnValue(null);
    }


}
