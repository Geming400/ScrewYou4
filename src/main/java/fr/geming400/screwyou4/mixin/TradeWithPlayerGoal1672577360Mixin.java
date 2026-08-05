package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.TradeWithPlayerGoal.class)
public class TradeWithPlayerGoal1672577360Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_46412001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(46412001L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1045286591(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1045286591L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_758137296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(758137296L))
            info.setReturnValue(true);
    }


}
