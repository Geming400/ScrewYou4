package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.input.NumberRangeInput.class)
public class NumberRangeInput1081839802Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1827615235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827615235L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__53620173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-53620173L))
            info.setReturnValue("`i]cX\u8258\u240B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1120102544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1120102544L))
            info.setReturnValue(616767279);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_1120102048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1120102048L))
            info.setReturnValue(-780640726);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label__1095069363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1095069363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec__1477273770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1477273770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "computeLabel(Ljava/lang/String;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void computeLabel__446786685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-446786685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "labelFormat()Ljava/lang/String;", cancellable = true)
    private void labelFormat__53620669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-53620669L))
            info.setReturnValue("d=N:j7jUT_qNSggeF\u7BDB!+7OB4H=8saA/5;!|DW}cXI{GQ}z>HSg\uBB00p");
    }

    @Inject(at = @At("HEAD"), method = "rangeInfo()Lnet/minecraft/server/dialog/input/NumberRangeInput$RangeInfo;", cancellable = true)
    private void rangeInfo_926834647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(926834647L))
            info.setReturnValue(null);
    }


}
