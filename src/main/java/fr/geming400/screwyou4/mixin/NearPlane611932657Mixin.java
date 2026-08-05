package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.Camera.NearPlane.class)
public class NearPlane611932657Mixin {
        @Inject(at = @At("HEAD"), method = "getTopLeft()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getTopLeft_1709662186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709662186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBottomLeft()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getBottomLeft_1709662186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709662186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTopRight()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getTopRight_1709662186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709662186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBottomRight()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getBottomRight_1709662186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709662186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPointOnPlane(FF)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPointOnPlane_1322274474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1322274474L))
            info.setReturnValue(null);
    }


}
