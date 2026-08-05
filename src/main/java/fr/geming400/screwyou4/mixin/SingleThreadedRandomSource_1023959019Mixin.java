package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.SingleThreadedRandomSource.class)
public class SingleThreadedRandomSource_1023959019Mixin {
        @Inject(at = @At("HEAD"), method = "next(I)I", cancellable = true)
    private void next__2057103799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2057103799L))
            info.setReturnValue(79108545);
    }

    @Inject(at = @At("HEAD"), method = "fork()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fork__1025665865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1025665865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSeed(J)V", cancellable = true)
    private void setSeed__2056167785(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2056167785L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextGaussian()D", cancellable = true)
    private void nextGaussian_1062216459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1062216459L))
            info.setReturnValue(7.585266009512198E8D);
    }

    @Inject(at = @At("HEAD"), method = "forkPositional()Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void forkPositional__202158452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-202158452L))
            info.setReturnValue(null);
    }


}
