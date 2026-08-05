package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.FleeSunGoal.class)
public class FleeSunGoal_1346101301Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1384376039(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1384376039L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1384379883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384379883L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1384379883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384379883L))
            info.setReturnValue(false);
    }


}
