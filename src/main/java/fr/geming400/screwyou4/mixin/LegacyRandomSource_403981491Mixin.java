package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.LegacyRandomSource.class)
public class LegacyRandomSource_403981491Mixin {
        @Inject(at = @At("HEAD"), method = "next(I)I", cancellable = true)
    private void next_1617885969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617885969L))
            info.setReturnValue(1302949403);
    }

    @Inject(at = @At("HEAD"), method = "fork()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fork__1645643393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1645643393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSeed(J)V", cancellable = true)
    private void setSeed_1618821983(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1618821983L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextGaussian()D", cancellable = true)
    private void nextGaussian_442238931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(442238931L))
            info.setReturnValue(4.2137700031525475E8D);
    }

    @Inject(at = @At("HEAD"), method = "forkPositional()Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void forkPositional__822135980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-822135980L))
            info.setReturnValue(null);
    }


}
