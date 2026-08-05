package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.UniformFloat.class)
public class UniformFloat_1012127120Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1897327918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897327918L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__123333352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-123333352L))
            info.setReturnValue(" 挀h5vBǧ!|2Q4-CHk}ត+䇶N뭟P)㥷A#荶N>u4d53k컭j}YN|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1050389861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050389861L))
            info.setReturnValue(1141804204);
    }

    @Inject(at = @At("HEAD"), method = "min()F", cancellable = true)
    private void min_1050386482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050386482L))
            info.setReturnValue(5.652278E8F);
    }

    @Inject(at = @At("HEAD"), method = "max()F", cancellable = true)
    private void max_1050386482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050386482L))
            info.setReturnValue(5.652278E8F);
    }

    @Inject(at = @At("HEAD"), method = "of(FF)Lnet/minecraft/util/valueproviders/UniformFloat;", cancellable = true)
    private static void of__2046960856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2046960856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1546986453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1546986453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)F", cancellable = true)
    private void sample__694903342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-694903342L))
            info.setReturnValue(5.652278E8F);
    }


}
