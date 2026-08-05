package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.TickThrottler.class)
public class TickThrottler_156541059Mixin {
        @Inject(at = @At("HEAD"), method = "increment()V", cancellable = true)
    private void increment_1916725542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1916725542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_26857400(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(26857400L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isUnderThreshold()Z", cancellable = true)
    private void isUnderThreshold__1250633700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250633700L))
            info.setReturnValue(false);
    }


}
