package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.InterpolationHandler.class)
public class InterpolationHandler649323794Mixin {
        @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position_1226881346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1226881346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cancel()V", cancellable = true)
    private void cancel__975324789(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-975324789L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "interpolate()V", cancellable = true)
    private void interpolate__953709724(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-953709724L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasActiveInterpolation()Z", cancellable = true)
    private void hasActiveInterpolation__1220315643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220315643L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "interpolateTo(Lnet/minecraft/world/phys/Vec3;FF)V", cancellable = true)
    private void interpolateTo__333887507(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-333887507L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot_960126935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(960126935L))
            info.setReturnValue(4.536999E8F);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot__1527385898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1527385898L))
            info.setReturnValue(4.536999E8F);
    }

    @Inject(at = @At("HEAD"), method = "setInterpolationLength(I)V", cancellable = true)
    private void setInterpolationLength_200896550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(200896550L))
            info.cancel();
    }


}
