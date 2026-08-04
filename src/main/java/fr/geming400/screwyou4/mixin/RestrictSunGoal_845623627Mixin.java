package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RestrictSunGoal.class)
public class RestrictSunGoal_845623627Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_883898365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(883898365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_883898365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(883898365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_883902209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(883902209L))
            info.setReturnValue(null);
    }


}
