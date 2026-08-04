package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.control.LookControl.class)
public class LookControl1785459856Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1823734595(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1823734595L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLookingAtTarget()Z", cancellable = true)
    private void isLookingAtTarget_1823738439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823738439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLookAt(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void setLookAt__2141771441(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2141771441L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLookAt(Lnet/minecraft/world/entity/Entity;FF)V", cancellable = true)
    private void setLookAt__2037064804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2037064804L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLookAt(DDD)V", cancellable = true)
    private void setLookAt_715052983(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(715052983L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLookAt(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void setLookAt_1333735196(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1333735196L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLookAt(DDDFF)V", cancellable = true)
    private void setLookAt_409782647(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(409782647L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWantedY()D", cancellable = true)
    private void getWantedY_1823717297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823717297L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWantedX()D", cancellable = true)
    private void getWantedX_1823717297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823717297L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWantedZ()D", cancellable = true)
    private void getWantedZ_1823717297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823717297L))
            info.setReturnValue(null);
    }


}
