package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunctions.Spline.Point.class)
public class Point_1986080808Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__923374230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-923374230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_850620832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850620832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2024343549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2024343549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "context()Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;", cancellable = true)
    private void context_1709615113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709615113L))
            info.setReturnValue(null);
    }


}
