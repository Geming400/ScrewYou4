package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.LegacyRandomSource.class)
public class LegacyRandomSource_403981491Mixin {
        @Inject(at = @At("HEAD"), method = "next(I)I", cancellable = true)
    private void next__2132982844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2132982844L))
            info.setReturnValue(564617745);
    }

    @Inject(at = @At("HEAD"), method = "fork()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fork__1683251715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1683251715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSeed(J)V", cancellable = true)
    private void setSeed_1587920658(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1587920658L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextGaussian()D", cancellable = true)
    private void nextGaussian_276031109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(276031109L))
            info.setReturnValue(3.3045870060940325E8D);
    }

    @Inject(at = @At("HEAD"), method = "forkPositional()Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void forkPositional_1994121418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994121418L))
            info.setReturnValue(null);
    }


}
