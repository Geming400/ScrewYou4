package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Direction.AxisDirection.class)
public class AxisDirection_689903389Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1198943514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1198943514L))
            info.setReturnValue("Y+=TT0\u1864\u08A3SX]14_'kFWp#z\u558DP\uC0CDWul[\uBF79l\u74ED!\uBE5F9s_E!\u0A81");
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1460326417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1460326417L))
            info.setReturnValue("2f8viez/\u5A03A\u274FxDOTk|h.Y9#KETt8<A9l\u7C9AB_aT7Go|s\u441E\uB048&I\uC5B3?S\u1DA0\u6F16F\uA44Fr$\u353B}J.?:#_\u7135\u661E");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/core/Direction$AxisDirection;", cancellable = true)
    private static void values_812175772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(812175772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/core/Direction$AxisDirection;", cancellable = true)
    private static void valueOf__171561309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-171561309L))
            info.setReturnValue(net.minecraft.core.Direction.AxisDirection.NEGATIVE);
    }

    @Inject(at = @At("HEAD"), method = "getStep()I", cancellable = true)
    private void getStep_1972287232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972287232L))
            info.setReturnValue(409619328);
    }

    @Inject(at = @At("HEAD"), method = "opposite()Lnet/minecraft/core/Direction$AxisDirection;", cancellable = true)
    private void opposite_1251065780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1251065780L))
            info.setReturnValue(net.minecraft.core.Direction.AxisDirection.POSITIVE);
    }


}
