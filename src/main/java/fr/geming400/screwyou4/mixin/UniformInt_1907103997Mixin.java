package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.UniformInt.class)
public class UniformInt_1907103997Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1002351041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002351041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_771643525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(771643525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1945366738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945366738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(II)Lnet/minecraft/util/valueproviders/UniformInt;", cancellable = true)
    private static void of__863209278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-863209278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__652009576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-652009576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void sample_200076418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(200076418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_1945366242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945366242L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive_1945366242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945366242L))
            info.setReturnValue(null);
    }


}
