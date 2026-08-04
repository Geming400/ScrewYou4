package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CubicSpline.Builder.class)
public class Builder541519740Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private void build_1255922504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1255922504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPoint(FFF)Lnet/minecraft/util/CubicSpline$Builder;", cancellable = true)
    private void addPoint__1622296037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1622296037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPoint(FLnet/minecraft/util/CubicSpline;)Lnet/minecraft/util/CubicSpline$Builder;", cancellable = true)
    private void addPoint__1912552594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1912552594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPoint(FF)Lnet/minecraft/util/CubicSpline$Builder;", cancellable = true)
    private void addPoint__2009782447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2009782447L))
            info.setReturnValue(null);
    }


}
