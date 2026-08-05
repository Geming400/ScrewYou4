package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.ConstantFloat.class)
public class ConstantFloat_1081487142Mixin {
        @Inject(at = @At("HEAD"), method = "value()F", cancellable = true)
    private void value_1119746504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119746504L))
            info.setReturnValue(3.542803E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1827967896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827967896L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__53973330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-53973330L))
            info.setReturnValue("o9W9)\uFE14:d=:];_Dp:\u8B495C3W-9'DL\uB024l\u3ED6{}5\u064FKVFV^D2\u0CAFXZP93\u87F1]l$\u05BCmh@ NoE)\u2B506");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1119749883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119749883L))
            info.setReturnValue(-2146761020);
    }

    @Inject(at = @At("HEAD"), method = "min()F", cancellable = true)
    private void min_1119746504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119746504L))
            info.setReturnValue(3.542803E8F);
    }

    @Inject(at = @At("HEAD"), method = "max()F", cancellable = true)
    private void max_1119746504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119746504L))
            info.setReturnValue(3.542803E8F);
    }

    @Inject(at = @At("HEAD"), method = "of(F)Lnet/minecraft/util/valueproviders/ConstantFloat;", cancellable = true)
    private static void of__1814017404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814017404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1477626431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1477626431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)F", cancellable = true)
    private void sample__625543320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625543320L))
            info.setReturnValue(3.542803E8F);
    }


}
