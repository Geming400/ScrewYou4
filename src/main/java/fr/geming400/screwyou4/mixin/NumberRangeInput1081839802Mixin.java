package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.input.NumberRangeInput.class)
public class NumberRangeInput1081839802Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_173213534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(173213534L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1852263327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852263327L))
            info.setReturnValue("lL}t\u97EC;tld5`!uf@icnW+[0hN*f#K>d\uD551cX#DK:C=Z\uFCB8)l?Us\u42A4m,R'o]vx<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1639191893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1639191893L))
            info.setReturnValue(1988801103);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__558308198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-558308198L))
            info.setReturnValue(-775875729);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label_1694113601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1694113601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec_337844732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337844732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rangeInfo()Lnet/minecraft/server/dialog/input/NumberRangeInput$RangeInfo;", cancellable = true)
    private void rangeInfo_1489239202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1489239202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "computeLabel(Ljava/lang/String;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void computeLabel__454376704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-454376704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "labelFormat()Ljava/lang/String;", cancellable = true)
    private void labelFormat_1254146574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254146574L))
            info.setReturnValue("^\u69F4;!yjY!\"tYk\u62E9\u9155_gI{A\u115C:n\u7F56\u0CAD\u3F5D\u0777gah`(Jx.HE7V71h?!<.F !xvo#\"z\uD621[%T\u695Fjt:\"\u8C35f\u1AC5_iMs \u74BF\u5BA0");
    }


}
