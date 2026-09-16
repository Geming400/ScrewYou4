package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.EasingType.CubicBezierControls.class)
public class CubicBezierControls298869246Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__609757022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609757022L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1069292771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069292771L))
            info.setReturnValue("4z*@Qch\u2976]t%;dA0!8:,k\"UYV-&=B=\u431F\u7C539eV_x<=\uC369BG8oBZ[sj{\u1022:V>/5g^sByBZN\u6EA4gG\u9BA60OyA\u1B10dW)C31X'`?x$(D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_856221337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(856221337L))
            info.setReturnValue(1759809595);
    }

    @Inject(at = @At("HEAD"), method = "x1()F", cancellable = true)
    private void x1_866216328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866216328L))
            info.setReturnValue(1.150127E8F);
    }

    @Inject(at = @At("HEAD"), method = "x2()F", cancellable = true)
    private void x2_894845479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894845479L))
            info.setReturnValue(1.150127E8F);
    }

    @Inject(at = @At("HEAD"), method = "y1()F", cancellable = true)
    private void y1_1753720009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1753720009L))
            info.setReturnValue(1.150127E8F);
    }

    @Inject(at = @At("HEAD"), method = "y2()F", cancellable = true)
    private void y2_1782349160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1782349160L))
            info.setReturnValue(1.150127E8F);
    }


}
