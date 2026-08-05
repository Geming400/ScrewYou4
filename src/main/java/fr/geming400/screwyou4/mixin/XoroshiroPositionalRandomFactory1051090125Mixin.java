package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.XoroshiroRandomSource.XoroshiroPositionalRandomFactory.class)
public class XoroshiroPositionalRandomFactory1051090125Mixin {
        @Inject(at = @At("HEAD"), method = "at(III)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void at__73358605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-73358605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parityConfigString(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void parityConfigString_2118872609(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2118872609L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromSeed(J)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fromSeed__1783750252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1783750252L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromHashOf(Ljava/lang/String;)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fromHashOf_199263652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199263652L))
            info.setReturnValue(null);
    }


}
