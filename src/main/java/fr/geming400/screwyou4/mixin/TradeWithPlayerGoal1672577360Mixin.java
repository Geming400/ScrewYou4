package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.TradeWithPlayerGoal.class)
public class TradeWithPlayerGoal1672577360Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1710852099(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1710852099L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1710852099(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1710852099L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1710855943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1710855943L))
            info.setReturnValue(null);
    }


}
