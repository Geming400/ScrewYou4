package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CubicSpline.Constant.class)
public class Constant205311339Mixin {
        @Inject(at = @At("HEAD"), method = "value()F", cancellable = true)
    private void value_243570702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243570702L))
            info.setReturnValue(1.93235E7F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1590823598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1590823598L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__930148636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930148636L))
            info.setReturnValue(">5MI|\u7A22M$)\u9864\uAA60A#-.fT|{'G>yZ\u4CC69\uCF6A\u1A43");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_243574081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243574081L))
            info.setReturnValue(387471290);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()F", cancellable = true)
    private void maxValue_243570702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243570702L))
            info.setReturnValue(1.93235E7F);
    }

    @Inject(at = @At("HEAD"), method = "minValue()F", cancellable = true)
    private void minValue_243570702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243570702L))
            info.setReturnValue(1.93235E7F);
    }

    @Inject(at = @At("HEAD"), method = "mapCoordinates(Ljava/util/function/UnaryOperator;)Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private void mapCoordinates_1457922180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1457922180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parityString()Ljava/lang/String;", cancellable = true)
    private void parityString__930149132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930149132L))
            info.setReturnValue("qy|qjs ;\u1F6CjRnlR?^xYZA\":w,=`99=XJhuTx\u5785");
    }


}
