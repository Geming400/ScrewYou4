package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerTickRateManager.class)
public class ServerTickRateManager233590719Mixin {
        @Inject(at = @At("HEAD"), method = "updateJoiningPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void updateJoiningPlayer__535971134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-535971134L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkShouldSprintThisTick()Z", cancellable = true)
    private void checkShouldSprintThisTick_271869302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271869302L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "endTickWork()V", cancellable = true)
    private void endTickWork_271865458(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(271865458L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSprinting()Z", cancellable = true)
    private void isSprinting_271869302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271869302L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setFrozen(Z)V", cancellable = true)
    private void setFrozen_1463207548(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1463207548L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTickRate(F)V", cancellable = true)
    private void setTickRate_1444737128(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1444737128L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopSprinting()Z", cancellable = true)
    private void stopSprinting_271869302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271869302L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "requestGameToSprint(I)Z", cancellable = true)
    private void requestGameToSprint_1447511535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447511535L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "stepGameIfPaused(I)Z", cancellable = true)
    private void stepGameIfPaused_1447511535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447511535L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "stopStepping()Z", cancellable = true)
    private void stopStepping_271869302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271869302L))
            info.setReturnValue(false);
    }


}
