package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.BiasedToBottomInt.class)
public class BiasedToBottomInt1469865043Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_561238775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561238775L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2054679224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2054679224L))
            info.setReturnValue("nu=Nt2#CbGl^!2P_IJs>oV.Hf\u879FO\u99FA;iEZ\"f^'ol:@T6#e*Hygc^c");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2027217134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2027217134L))
            info.setReturnValue(241376696);
    }

    @Inject(at = @At("HEAD"), method = "of(II)Lnet/minecraft/util/valueproviders/BiasedToBottomInt;", cancellable = true)
    private static void of_628176332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628176332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1758656999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1758656999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive__499974575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499974575L))
            info.setReturnValue(99891942);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_1815070399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1815070399L))
            info.setReturnValue(-834326167);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void sample_436803075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(436803075L))
            info.setReturnValue(-725295982);
    }


}
