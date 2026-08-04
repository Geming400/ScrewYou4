package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.InterpolationHandler.class)
public class InterpolationHandler649323794Mixin {
        @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position_1747053323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1747053323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cancel()V", cancellable = true)
    private void cancel_687598533(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(687598533L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "interpolate()V", cancellable = true)
    private void interpolate_687598533(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(687598533L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasActiveInterpolation()Z", cancellable = true)
    private void hasActiveInterpolation_687602377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(687602377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interpolateTo(Lnet/minecraft/world/phys/Vec3;FF)V", cancellable = true)
    private void interpolateTo__1650522735(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1650522735L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot_687583157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(687583157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot_687583157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(687583157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setInterpolationLength(I)V", cancellable = true)
    private void setInterpolationLength_1863240766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1863240766L))
            info.cancel();
    }


}
