package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RunAroundLikeCrazyGoal.class)
public class RunAroundLikeCrazyGoal_243549045Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__1382616315(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1382616315L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__670891020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-670891020L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_113865386(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(113865386L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse__446086250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-446086250L))
            info.setReturnValue(true);
    }


}
