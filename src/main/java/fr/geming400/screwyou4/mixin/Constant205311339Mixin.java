package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CubicSpline.Constant.class)
public class Constant205311339Mixin {
        @Inject(at = @At("HEAD"), method = "value()F", cancellable = true)
    private void value__2099362499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2099362499L))
            info.setReturnValue(6.361645E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__703314929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-703314929L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_975734864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(975734864L))
            info.setReturnValue("lx;J+/O\u5589o;o3XZzU+.,A];!xo6a:wj\uAF79\u836ET\u9D84Z\"iPQ\u9400{]%\u4DEC;hL/`1r`8\u5DCCN");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_762663430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(762663430L))
            info.setReturnValue(-476232223);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()F", cancellable = true)
    private void maxValue_1023236545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1023236545L))
            info.setReturnValue(6.371637E8F);
    }

    @Inject(at = @At("HEAD"), method = "minValue()F", cancellable = true)
    private void minValue__1449424593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1449424593L))
            info.setReturnValue(6.371637E8F);
    }

    @Inject(at = @At("HEAD"), method = "parityString()Ljava/lang/String;", cancellable = true)
    private void parityString_2095190354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095190354L))
            info.setReturnValue("n&+PH\uFB4B$%\u523EUya:.t-XPH\u1E86\u655F0^f?\u6EF9\u93B4R\"W|DGGJI=[");
    }

    @Inject(at = @At("HEAD"), method = "mapCoordinates(Ljava/util/function/UnaryOperator;)Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private void mapCoordinates_1729607747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1729607747L))
            info.setReturnValue(null);
    }


}
