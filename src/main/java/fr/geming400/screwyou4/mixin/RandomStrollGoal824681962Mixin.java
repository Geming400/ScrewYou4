package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RandomStrollGoal.class)
public class RandomStrollGoal824681962Mixin {
        @Inject(at = @At("HEAD"), method = "trigger()V", cancellable = true)
    private void trigger_862956701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(862956701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_862956701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(862956701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_862956701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(862956701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_862960545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862960545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setInterval(I)V", cancellable = true)
    private void setInterval_2038598934(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2038598934L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_862960545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862960545L))
            info.setReturnValue(null);
    }


}
