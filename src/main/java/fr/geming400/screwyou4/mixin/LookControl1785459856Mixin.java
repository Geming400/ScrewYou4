package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.control.LookControl.class)
public class LookControl1785459856Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1655776198(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1655776198L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLookingAtTarget()Z", cancellable = true)
    private void isLookingAtTarget_340042058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340042058L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setLookAt(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void setLookAt_1382095235(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1382095235L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLookAt(DDD)V", cancellable = true)
    private void setLookAt_1557356011(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1557356011L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLookAt(DDDFF)V", cancellable = true)
    private void setLookAt__1885826389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1885826389L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLookAt(Lnet/minecraft/world/entity/Entity;FF)V", cancellable = true)
    private void setLookAt__2077305648(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2077305648L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLookAt(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void setLookAt_770565456(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(770565456L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWantedY()D", cancellable = true)
    private void getWantedY_806876381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(806876381L))
            info.setReturnValue(6.096994007435025E8D);
    }

    @Inject(at = @At("HEAD"), method = "getWantedX()D", cancellable = true)
    private void getWantedX_778247230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(778247230L))
            info.setReturnValue(6.096994008597187E8D);
    }

    @Inject(at = @At("HEAD"), method = "getWantedZ()D", cancellable = true)
    private void getWantedZ_835505532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(835505532L))
            info.setReturnValue(6.096994005222651E8D);
    }


}
