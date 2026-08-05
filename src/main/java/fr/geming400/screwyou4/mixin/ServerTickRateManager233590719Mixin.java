package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerTickRateManager.class)
public class ServerTickRateManager233590719Mixin {
        @Inject(at = @At("HEAD"), method = "updateJoiningPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void updateJoiningPlayer_83684338(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(83684338L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkShouldSprintThisTick()Z", cancellable = true)
    private void checkShouldSprintThisTick_1869939750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1869939750L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "endTickWork()V", cancellable = true)
    private void endTickWork__1297431607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1297431607L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTickRate(F)V", cancellable = true)
    private void setTickRate__863774777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-863774777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSprinting()Z", cancellable = true)
    private void isSprinting_844774072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(844774072L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "stepGameIfPaused(I)Z", cancellable = true)
    private void stepGameIfPaused__1824533800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1824533800L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "requestGameToSprint(I)Z", cancellable = true)
    private void requestGameToSprint_71327781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(71327781L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "stopStepping()Z", cancellable = true)
    private void stopStepping__1659267818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1659267818L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "stopSprinting()Z", cancellable = true)
    private void stopSprinting_1219779472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1219779472L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setFrozen(Z)V", cancellable = true)
    private void setFrozen__1739919714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1739919714L))
            info.cancel();
    }


}
