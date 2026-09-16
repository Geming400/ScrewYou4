package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.control.MoveControl.class)
public class MoveControl_1317587042Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1187903383(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1187903383L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSpeedModifier()D", cancellable = true)
    private void getSpeedModifier_1739142138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1739142138L))
            info.setReturnValue(9.90519100681419E8D);
    }

    @Inject(at = @At("HEAD"), method = "setWait()V", cancellable = true)
    private void setWait_1830031485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1830031485L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "strafe(FF)V", cancellable = true)
    private void strafe__1677373979(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1677373979L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWantedY()D", cancellable = true)
    private void getWantedY_339003566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339003566L))
            info.setReturnValue(9.905191005951661E8D);
    }

    @Inject(at = @At("HEAD"), method = "hasWanted()Z", cancellable = true)
    private void hasWanted_1641294287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1641294287L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getWantedX()D", cancellable = true)
    private void getWantedX_310374415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(310374415L))
            info.setReturnValue(9.905191008015118E8D);
    }

    @Inject(at = @At("HEAD"), method = "getWantedZ()D", cancellable = true)
    private void getWantedZ_367632717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(367632717L))
            info.setReturnValue(9.905191003399887E8D);
    }

    @Inject(at = @At("HEAD"), method = "setWantedPosition(DDDD)V", cancellable = true)
    private void setWantedPosition_84711258(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(84711258L))
            info.cancel();
    }


}
