package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.TemptGoal.class)
public class TemptGoal_680031643Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_718306381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(718306381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_718306381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(718306381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_718310225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(718310225L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_718306381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(718306381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_718310225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(718310225L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_718310225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(718310225L))
            info.setReturnValue(false);
    }


}
