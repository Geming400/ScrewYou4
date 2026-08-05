package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.WeightedListInt.class)
public class WeightedListInt1583587660Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1644934382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644934382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive__386251958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-386251958L))
            info.setReturnValue(-1363257851);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_1928793016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1928793016L))
            info.setReturnValue(-856409607);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void sample_550525692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550525692L))
            info.setReturnValue(1242712318);
    }


}
