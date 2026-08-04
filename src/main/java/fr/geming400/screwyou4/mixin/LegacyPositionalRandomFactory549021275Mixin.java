package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.LegacyRandomSource.LegacyPositionalRandomFactory.class)
public class LegacyPositionalRandomFactory549021275Mixin {
        @Inject(at = @At("HEAD"), method = "at(III)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void at__575427455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-575427455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parityConfigString(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void parityConfigString_1616803759(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1616803759L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromHashOf(Ljava/lang/String;)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fromHashOf__302805198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302805198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromSeed(J)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fromSeed_2009148194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2009148194L))
            info.setReturnValue(null);
    }


}
