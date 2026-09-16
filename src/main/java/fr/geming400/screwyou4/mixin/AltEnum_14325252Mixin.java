package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.AltEnum.class)
public class AltEnum_14325252Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__894301017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-894301017L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_784748776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(784748776L))
            info.setReturnValue("Zw5iAw#\uA7FA#R\u354E+7c/lMzTCk:2[_I0wbCp\u4134\u5FBE,B\u272E?#oJmU}a0:wh]_.na.*sgP\u2127s\u1AC88H&[c\u43FEk9\u27FD\uBEAC\u8F84\u0A74\u8DD94L$}m1-?rjK 3#5`\uAFA3GTyT\u0752=e");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values_1192246357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192246357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_571677342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(571677342L))
            info.setReturnValue(-1223050135);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void validateValue_628981968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628981968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "altCondition()Ljava/util/function/BooleanSupplier;", cancellable = true)
    private void altCondition__1087449658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1087449658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueSetter()Lnet/minecraft/client/OptionInstance$CycleableValueSet$ValueSetter;", cancellable = true)
    private void valueSetter__381866076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381866076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueListSupplier()Lnet/minecraft/client/gui/components/CycleButton$ValueListSupplier;", cancellable = true)
    private void valueListSupplier_371225522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371225522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "altValues()Ljava/util/List;", cancellable = true)
    private void altValues_1142300894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142300894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1790384289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790384289L))
            info.setReturnValue(null);
    }


}
