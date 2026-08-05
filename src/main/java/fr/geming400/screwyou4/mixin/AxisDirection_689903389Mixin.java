package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Direction.AxisDirection.class)
public class AxisDirection_689903389Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__445557083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-445557083L))
            info.setReturnValue("H硛po$dZ nG6W<*'/E'Wd(dE@_aB곀^然lLDhti@q䎛桹WV겊S.*");
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__445557083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-445557083L))
            info.setReturnValue("H硛po$dZ nG6W<*'/E'Wd(dE@_aB곀^然lLDhti@q䎛桹WV겊S.*");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/core/Direction$AxisDirection;", cancellable = true)
    private static void values__2126201218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2126201218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/core/Direction$AxisDirection;", cancellable = true)
    private static void valueOf__121006725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-121006725L))
            info.setReturnValue(net.minecraft.core.Direction.AxisDirection.NEGATIVE);
    }

    @Inject(at = @At("HEAD"), method = "getStep()I", cancellable = true)
    private void getStep_728165634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(728165634L))
            info.setReturnValue(-1327390736);
    }

    @Inject(at = @At("HEAD"), method = "opposite()Lnet/minecraft/core/Direction$AxisDirection;", cancellable = true)
    private void opposite_1746834125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1746834125L))
            info.setReturnValue(net.minecraft.core.Direction.AxisDirection.POSITIVE);
    }


}
