package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.SingleThreadedRandomSource.class)
public class SingleThreadedRandomSource_1023959019Mixin {
        @Inject(at = @At("HEAD"), method = "next(I)I", cancellable = true)
    private void next__1513005316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1513005316L))
            info.setReturnValue(-511733843);
    }

    @Inject(at = @At("HEAD"), method = "fork()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fork__1063274187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1063274187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSeed(J)V", cancellable = true)
    private void setSeed__2087069110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2087069110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextGaussian()D", cancellable = true)
    private void nextGaussian_896008637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(896008637L))
            info.setReturnValue(4.586698002294123E8D);
    }

    @Inject(at = @At("HEAD"), method = "forkPositional()Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;", cancellable = true)
    private void forkPositional__1680868350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1680868350L))
            info.setReturnValue(null);
    }


}
