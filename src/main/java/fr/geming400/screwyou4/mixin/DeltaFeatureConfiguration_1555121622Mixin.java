package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.DeltaFeatureConfiguration.class)
public class DeltaFeatureConfiguration_1555121622Mixin {
        @Inject(at = @At("HEAD"), method = "size()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void size__914565282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-914565282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void contents__740637245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-740637245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rimSize()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void rimSize__914565282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-914565282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rim()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rim__740637245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-740637245L))
            info.setReturnValue(null);
    }


}
