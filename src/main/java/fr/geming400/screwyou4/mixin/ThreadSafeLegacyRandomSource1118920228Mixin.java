package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.ThreadSafeLegacyRandomSource.class)
public class ThreadSafeLegacyRandomSource1118920228Mixin {
        @Inject(at = @At("HEAD"), method = "next(I)I", cancellable = true)
    private void next__1418044106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1418044106L))
            info.setReturnValue(-425022007);
    }

    @Inject(at = @At("HEAD"), method = "fork()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fork__968312977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968312977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSeed(J)V", cancellable = true)
    private void setSeed__1992107900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1992107900L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextGaussian()D", cancellable = true)
    private void nextGaussian_990969847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(990969847L))
            info.setReturnValue(4.894593004443446E8D);
    }

    @Inject(at = @At("HEAD"), method = "forkPositional()Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void forkPositional__1585907140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1585907140L))
            info.setReturnValue(null);
    }


}
