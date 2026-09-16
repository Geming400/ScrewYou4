package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.EatBlockGoal.class)
public class EatBlockGoal_1537131778Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__89033582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-89033582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1180732174(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1180732174L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_622691713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(622691713L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1407448119(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1407448119L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_847496483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(847496483L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getEatAnimationTick()I", cancellable = true)
    private void getEatAnimationTick_1965452296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965452296L))
            info.setReturnValue(12582003);
    }


}
