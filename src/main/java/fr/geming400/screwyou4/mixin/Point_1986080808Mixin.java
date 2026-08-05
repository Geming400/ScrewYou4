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
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_850620832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850620832L))
            info.setReturnValue("kEAkL75]WBKL0N{\uFD07JpcEXvyQF6o\uD5B1g\u1058a\uC59A4\u6FAEX/9QwG\u82DClm,=\uC5FB3O|!e6\uB50B-4,\u4D5F9<\u612151CJ5|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2024343549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2024343549L))
            info.setReturnValue(-1740579784);
    }

    @Inject(at = @At("HEAD"), method = "context()Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;", cancellable = true)
    private void context_1709615113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709615113L))
            info.setReturnValue(null);
    }


}
