package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.OpenDoorGoal.class)
public class OpenDoorGoal_1174498879Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__451666481(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-451666481L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1543365073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1543365073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1044815220(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1044815220L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_484863584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484863584L))
            info.setReturnValue(true);
    }


}
