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
            info.setReturnValue("6&sGL\"㞒tC g갹$(9xE=2$4R䰔t:攘a봹\"z%V).pxN[zASf馺Da闏㭼W88Z](+ \"Iy)PrJřYK颃;7\"uVTo@-t轿嶢F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_337131988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337131988L))
            info.setReturnValue(499656459);
    }

    @Inject(at = @At("HEAD"), method = "x1()F", cancellable = true)
    private void x1_337128609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337128609L))
            info.setReturnValue(3.457063E8F);
    }

    @Inject(at = @At("HEAD"), method = "x2()F", cancellable = true)
    private void x2_337128609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337128609L))
            info.setReturnValue(3.457063E8F);
    }

    @Inject(at = @At("HEAD"), method = "y1()F", cancellable = true)
    private void y1_337128609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337128609L))
            info.setReturnValue(3.457063E8F);
    }

    @Inject(at = @At("HEAD"), method = "y2()F", cancellable = true)
    private void y2_337128609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337128609L))
            info.setReturnValue(3.457063E8F);
    }


}
