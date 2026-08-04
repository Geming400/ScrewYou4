package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.WeightedListInt.class)
public class WeightedListInt1583587660Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__975525912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975525912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void sample__123439918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-123439918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_1621849906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621849906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive_1621849906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621849906L))
            info.setReturnValue(null);
    }


}
