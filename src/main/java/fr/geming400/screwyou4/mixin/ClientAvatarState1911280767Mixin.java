package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.entity.ClientAvatarState.class)
public class ClientAvatarState1911280767Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void tick__846128718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-846128718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInterpolatedBob(F)F", cancellable = true)
    private void getInterpolatedBob__1172555496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172555496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInterpolatedWalkDistance(F)F", cancellable = true)
    private void getInterpolatedWalkDistance__1172555496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172555496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deltaMovementOnPreviousTick()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void deltaMovementOnPreviousTick__1285957000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1285957000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInterpolatedCloakZ(F)D", cancellable = true)
    private void getInterpolatedCloakZ__1172557418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172557418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInterpolatedCloakX(F)D", cancellable = true)
    private void getInterpolatedCloakX__1172557418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172557418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addWalkDistance(F)V", cancellable = true)
    private void addWalkDistance__1172540120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1172540120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInterpolatedCloakY(F)D", cancellable = true)
    private void getInterpolatedCloakY__1172557418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172557418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBackwardsInterpolatedWalkDistance(F)F", cancellable = true)
    private void getBackwardsInterpolatedWalkDistance__1172555496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172555496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetBob()V", cancellable = true)
    private void resetBob_1949555506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1949555506L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateBob(F)V", cancellable = true)
    private void updateBob__1172540120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1172540120L))
            info.cancel();
    }


}
