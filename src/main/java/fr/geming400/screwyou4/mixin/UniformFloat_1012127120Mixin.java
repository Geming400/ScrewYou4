package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.UniformFloat.class)
public class UniformFloat_1012127120Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_103500851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(103500851L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1782550148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1782550148L))
            info.setReturnValue("-zA?,\uB65B4>?Gf=\u015B\uCBC6\u1EC1?qP\uD6CEN7,Fv>nf'f");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1569479210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1569479210L))
            info.setReturnValue(-577883577);
    }

    @Inject(at = @At("HEAD"), method = "min()F", cancellable = true)
    private void min__409002720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-409002720L))
            info.setReturnValue(9.619511E8F);
    }

    @Inject(at = @At("HEAD"), method = "max()F", cancellable = true)
    private void max_1367193934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1367193934L))
            info.setReturnValue(9.619511E8F);
    }

    @Inject(at = @At("HEAD"), method = "of(FF)Lnet/minecraft/util/valueproviders/UniformFloat;", cancellable = true)
    private static void of__2077900353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2077900353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2078572373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2078572373L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)F", cancellable = true)
    private void sample__20937732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-20937732L))
            info.setReturnValue(9.619511E8F);
    }


}
