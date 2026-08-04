package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.OpenDoorGoal.class)
public class OpenDoorGoal_1174498879Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1212773617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1212773617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1212773617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1212773617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1212773617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1212773617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1212777461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1212777461L))
            info.setReturnValue(null);
    }


}
