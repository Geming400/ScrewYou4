package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RestrictSunGoal.class)
public class RestrictSunGoal_845623627Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__780541733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-780541733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1872240325(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1872240325L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__68816438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-68816438L))
            info.setReturnValue(false);
    }


}
