package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.BegGoal.class)
public class BegGoal794400841Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__831764518(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-831764518L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1923463110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1923463110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__120039223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-120039223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_664717183(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(664717183L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_104765547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104765547L))
            info.setReturnValue(false);
    }


}
