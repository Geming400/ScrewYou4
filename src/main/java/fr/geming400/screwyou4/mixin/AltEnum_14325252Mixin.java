package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.AltEnum.class)
public class AltEnum_14325252Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1399837510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399837510L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1121134724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1121134724L))
            info.setReturnValue("쥳肸䥿2JiW+\"t1,7虝ko! aWUcJeɢꨜUmH+^d]");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values_1640662067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1640662067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_52587993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(52587993L))
            info.setReturnValue(-986719667);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void validateValue__995531627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-995531627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "altValues()Ljava/util/List;", cancellable = true)
    private void altValues_1640662067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1640662067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__377640375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377640375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueSetter()Lnet/minecraft/client/OptionInstance$CycleableValueSet$ValueSetter;", cancellable = true)
    private void valueSetter_1181630196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1181630196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "altCondition()Ljava/util/function/BooleanSupplier;", cancellable = true)
    private void altCondition_451071572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451071572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueListSupplier()Lnet/minecraft/client/gui/components/CycleButton$ValueListSupplier;", cancellable = true)
    private void valueListSupplier__2001910611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2001910611L))
            info.setReturnValue(null);
    }


}
