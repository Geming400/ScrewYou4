package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.LegacyRandomSource.LegacyPositionalRandomFactory.class)
public class LegacyPositionalRandomFactory549021275Mixin {
        @Inject(at = @At("HEAD"), method = "at(III)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void at_1671449012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671449012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parityConfigString(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void parityConfigString_786120367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(786120367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromSeed(J)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fromSeed_512351261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(512351261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromHashOf(Ljava/lang/String;)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void fromHashOf_2014729859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2014729859L))
            info.setReturnValue(null);
    }


}
