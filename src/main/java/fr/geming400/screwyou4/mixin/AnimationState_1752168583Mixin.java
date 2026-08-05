package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.AnimationState.class)
public class AnimationState_1752168583Mixin {
        @Inject(at = @At("HEAD"), method = "start(I)V", cancellable = true)
    private void start__1328881742(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1328881742L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1790443321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1790443321L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isStarted()Z", cancellable = true)
    private void isStarted_1790447165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1790447165L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "copyFrom(Lnet/minecraft/world/entity/AnimationState;)V", cancellable = true)
    private void copyFrom_998349000(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(998349000L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTimeInMillis(F)J", cancellable = true)
    private void getTimeInMillis__1331663837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1331663837L))
            info.setReturnValue(-4702076043641531039L);
    }

    @Inject(at = @At("HEAD"), method = "startIfStopped(I)V", cancellable = true)
    private void startIfStopped__1328881742(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1328881742L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fastForward(IF)V", cancellable = true)
    private void fastForward_753518550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(753518550L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "animateWhen(ZI)V", cancellable = true)
    private void animateWhen_1242984680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1242984680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ifStarted(Ljava/util/function/Consumer;)V", cancellable = true)
    private void ifStarted__1861782301(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1861782301L))
            info.cancel();
    }


}
