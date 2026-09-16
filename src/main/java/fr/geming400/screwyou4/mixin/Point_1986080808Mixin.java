package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunctions.Spline.Point.class)
public class Point_1986080808Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1077454539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077454539L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1538462964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1538462964L))
            info.setReturnValue("^(bAo,hw-Vs4Xk,aZRtz-r\u55468AlPPo/GRC 5R\"::Z:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1751534398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751534398L))
            info.setReturnValue(687869017);
    }

    @Inject(at = @At("HEAD"), method = "context()Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;", cancellable = true)
    private void context_1200867000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200867000L))
            info.setReturnValue(null);
    }


}
