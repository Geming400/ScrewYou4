package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CubicSpline.Builder.class)
public class Builder541519740Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private void build_514425526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(514425526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPoint(FFF)Lnet/minecraft/util/CubicSpline$Builder;", cancellable = true)
    private void addPoint_1584767180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1584767180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPoint(FLnet/minecraft/util/CubicSpline;)Lnet/minecraft/util/CubicSpline$Builder;", cancellable = true)
    private void addPoint_667197023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(667197023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPoint(FF)Lnet/minecraft/util/CubicSpline$Builder;", cancellable = true)
    private void addPoint_1141712512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141712512L))
            info.setReturnValue(null);
    }


}
