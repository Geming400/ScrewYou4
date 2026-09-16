package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.TrapezoidFloat.class)
public class TrapezoidFloat1361642236Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_453015968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(453015968L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2132065265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2132065265L))
            info.setReturnValue("A\u49E1mVI8\uCCC5FUE@,\uD60D3pxC+\uC86F<)&z\u18BD\uA8353\uC3FF\u6881iC<S-!#m(\u8613;h");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1918994327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918994327L))
            info.setReturnValue(-1084305075);
    }

    @Inject(at = @At("HEAD"), method = "min()F", cancellable = true)
    private void min__59487603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-59487603L))
            info.setReturnValue(2.137919E8F);
    }

    @Inject(at = @At("HEAD"), method = "max()F", cancellable = true)
    private void max_1716709051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1716709051L))
            info.setReturnValue(2.137919E8F);
    }

    @Inject(at = @At("HEAD"), method = "of(FFF)Lnet/minecraft/util/valueproviders/TrapezoidFloat;", cancellable = true)
    private static void of__274836196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-274836196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1866879806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1866879806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)F", cancellable = true)
    private void sample_328577385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(328577385L))
            info.setReturnValue(2.137919E8F);
    }

    @Inject(at = @At("HEAD"), method = "plateau()F", cancellable = true)
    private void plateau_255123989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(255123989L))
            info.setReturnValue(2.137919E8F);
    }


}
