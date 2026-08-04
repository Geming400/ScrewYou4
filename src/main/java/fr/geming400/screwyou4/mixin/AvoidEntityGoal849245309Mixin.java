package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.AvoidEntityGoal.class)
public class AvoidEntityGoal849245309Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_887520048(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(887520048L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_887520048(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(887520048L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_887523892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(887523892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_887520048(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(887520048L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_887523892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(887523892L))
            info.setReturnValue(null);
    }


}
