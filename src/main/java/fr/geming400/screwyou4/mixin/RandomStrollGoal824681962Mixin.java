package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RandomStrollGoal.class)
public class RandomStrollGoal824681962Mixin {
        @Inject(at = @At("HEAD"), method = "trigger()V", cancellable = true)
    private void trigger_1147480549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1147480549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__801483397(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-801483397L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1893181989(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1893181989L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__89758102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89758102L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setInterval(I)V", cancellable = true)
    private void setInterval_1489059613(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1489059613L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_135046668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135046668L))
            info.setReturnValue(false);
    }


}
