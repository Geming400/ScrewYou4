package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.ThreadSafeLegacyRandomSource.class)
public class ThreadSafeLegacyRandomSource1118920228Mixin {
        @Inject(at = @At("HEAD"), method = "next(I)I", cancellable = true)
    private void next__1962142589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1962142589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fork()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fork__930704655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930704655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSeed(J)V", cancellable = true)
    private void setSeed__1961206575(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1961206575L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextGaussian()D", cancellable = true)
    private void nextGaussian_1157177669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1157177669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forkPositional()Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void forkPositional__107197242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-107197242L))
            info.setReturnValue(null);
    }


}
