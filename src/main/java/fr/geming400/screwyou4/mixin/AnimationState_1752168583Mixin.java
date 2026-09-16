package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.AnimationState.class)
public class AnimationState_1752168583Mixin {
        @Inject(at = @At("HEAD"), method = "start(I)V", cancellable = true)
    private void start__1386917228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1386917228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__965695369(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-965695369L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isStarted()Z", cancellable = true)
    private void isStarted_1536485542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1536485542L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "copyFrom(Lnet/minecraft/world/entity/AnimationState;)V", cancellable = true)
    private void copyFrom__13830265(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-13830265L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTimeInMillis(F)J", cancellable = true)
    private void getTimeInMillis__1411800623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1411800623L))
            info.setReturnValue(-6129135817126790763L);
    }

    @Inject(at = @At("HEAD"), method = "fastForward(IF)V", cancellable = true)
    private void fastForward_377245933(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(377245933L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "animateWhen(ZI)V", cancellable = true)
    private void animateWhen__529981747(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-529981747L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startIfStopped(I)V", cancellable = true)
    private void startIfStopped__291397408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-291397408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ifStarted(Ljava/util/function/Consumer;)V", cancellable = true)
    private void ifStarted_243240071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(243240071L))
            info.cancel();
    }


}
