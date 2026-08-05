package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.LookAtPlayerGoal.class)
public class LookAtPlayerGoal2132913180Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_506747821(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(506747821L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__584950771(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-584950771L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1218473116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1218473116L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2003229522(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2003229522L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1443277886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1443277886L))
            info.setReturnValue(true);
    }


}
