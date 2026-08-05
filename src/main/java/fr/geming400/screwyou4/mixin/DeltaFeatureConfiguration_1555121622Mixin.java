package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.DeltaFeatureConfiguration.class)
public class DeltaFeatureConfiguration_1555121622Mixin {
        @Inject(at = @At("HEAD"), method = "size()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void size_1947439549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947439549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void contents_94931293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(94931293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rimSize()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void rimSize__118083641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-118083641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rim()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rim__1476980135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1476980135L))
            info.setReturnValue(null);
    }


}
