package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.Camera.NearPlane.class)
public class NearPlane611932657Mixin {
        @Inject(at = @At("HEAD"), method = "getBottomLeft()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getBottomLeft_1272517154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1272517154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBottomRight()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getBottomRight__1895975793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1895975793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTopRight()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getTopRight_2013795213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013795213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPointOnPlane(FF)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPointOnPlane__712732153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-712732153L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTopLeft()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getTopLeft_2091375460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091375460L))
            info.setReturnValue(null);
    }


}
