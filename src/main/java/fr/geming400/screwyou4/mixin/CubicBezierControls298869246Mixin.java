package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.EasingType.CubicBezierControls.class)
public class CubicBezierControls298869246Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1684381505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684381505L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__836590729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-836590729L))
            info.setReturnValue("6&sGL\"\u3792tC g\uAC39$(9xE=2$4R\u4C14t:\u6518a\uBD39\"z%V).pxN[zASf\u99BADa\u95CF\u3B7CW88Z](+ \"Iy)PrJ\u0159YK\u9883;7\"uVTo@-t\u8F7F\u5DA2F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_337131988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337131988L))
            info.setReturnValue(374602159);
    }

    @Inject(at = @At("HEAD"), method = "x1()F", cancellable = true)
    private void x1_337128609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337128609L))
            info.setReturnValue(2.20652E8F);
    }

    @Inject(at = @At("HEAD"), method = "x2()F", cancellable = true)
    private void x2_337128609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337128609L))
            info.setReturnValue(2.20652E8F);
    }

    @Inject(at = @At("HEAD"), method = "y1()F", cancellable = true)
    private void y1_337128609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337128609L))
            info.setReturnValue(2.20652E8F);
    }

    @Inject(at = @At("HEAD"), method = "y2()F", cancellable = true)
    private void y2_337128609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337128609L))
            info.setReturnValue(2.20652E8F);
    }


}
