package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.entity.ClientAvatarState.class)
public class ClientAvatarState1911280767Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void tick__974590219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-974590219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInterpolatedBob(F)F", cancellable = true)
    private void getInterpolatedBob__1653323500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1653323500L))
            info.setReturnValue(6.45464E8F);
    }

    @Inject(at = @At("HEAD"), method = "addWalkDistance(F)V", cancellable = true)
    private void addWalkDistance_2000825863(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2000825863L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInterpolatedCloakX(F)D", cancellable = true)
    private void getInterpolatedCloakX_2012662455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2012662455L))
            info.setReturnValue(6.454640005610186E8D);
    }

    @Inject(at = @At("HEAD"), method = "getInterpolatedCloakY(F)D", cancellable = true)
    private void getInterpolatedCloakY__1394801160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1394801160L))
            info.setReturnValue(6.454640009823831E8D);
    }

    @Inject(at = @At("HEAD"), method = "getInterpolatedCloakZ(F)D", cancellable = true)
    private void getInterpolatedCloakZ__507297479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-507297479L))
            info.setReturnValue(6.454640006640445E8D);
    }

    @Inject(at = @At("HEAD"), method = "getBackwardsInterpolatedWalkDistance(F)F", cancellable = true)
    private void getBackwardsInterpolatedWalkDistance__1739450061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739450061L))
            info.setReturnValue(6.45464E8F);
    }

    @Inject(at = @At("HEAD"), method = "getInterpolatedWalkDistance(F)F", cancellable = true)
    private void getInterpolatedWalkDistance_67153231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(67153231L))
            info.setReturnValue(6.45464E8F);
    }

    @Inject(at = @At("HEAD"), method = "deltaMovementOnPreviousTick()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void deltaMovementOnPreviousTick_655884062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655884062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetBob()V", cancellable = true)
    private void resetBob__2055771892(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2055771892L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateBob(F)V", cancellable = true)
    private void updateBob_250531924(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(250531924L))
            info.cancel();
    }


}
