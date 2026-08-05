package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.control.MoveControl.class)
public class MoveControl_1317587042Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1355861780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1355861780L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWait()V", cancellable = true)
    private void setWait_1355861780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1355861780L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "strafe(FF)V", cancellable = true)
    private void strafe_233049556(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(233049556L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWantedPosition(DDDD)V", cancellable = true)
    private void setWantedPosition__1777472492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1777472492L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSpeedModifier()D", cancellable = true)
    private void getSpeedModifier_1355844482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355844482L))
            info.setReturnValue(2.4951470067525417E8D);
    }

    @Inject(at = @At("HEAD"), method = "getWantedY()D", cancellable = true)
    private void getWantedY_1355844482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355844482L))
            info.setReturnValue(2.5052480067525417E8D);
    }

    @Inject(at = @At("HEAD"), method = "hasWanted()Z", cancellable = true)
    private void hasWanted_1355865624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355865624L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getWantedX()D", cancellable = true)
    private void getWantedX_1355844482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355844482L))
            info.setReturnValue(2.5052480067525417E8D);
    }

    @Inject(at = @At("HEAD"), method = "getWantedZ()D", cancellable = true)
    private void getWantedZ_1355844482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355844482L))
            info.setReturnValue(2.5052480067525417E8D);
    }


}
