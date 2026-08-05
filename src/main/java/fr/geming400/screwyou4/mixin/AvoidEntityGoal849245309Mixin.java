package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.AvoidEntityGoal.class)
public class AvoidEntityGoal849245309Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__776920050(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-776920050L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1868618642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1868618642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__65194755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-65194755L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_719561651(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(719561651L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_159610015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(159610015L))
            info.setReturnValue(false);
    }


}
