package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.XoroshiroRandomSource.XoroshiroPositionalRandomFactory.class)
public class XoroshiroPositionalRandomFactory1051090125Mixin {
        @Inject(at = @At("HEAD"), method = "at(III)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void at__2121449434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121449434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parityConfigString(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void parityConfigString_1288189217(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1288189217L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromHashOf(Ljava/lang/String;)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fromHashOf__1778168587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778168587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromSeed(J)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fromSeed_1014420111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1014420111L))
            info.setReturnValue(null);
    }


}
