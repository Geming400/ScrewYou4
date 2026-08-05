package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.LandOnOwnersShoulderGoal.class)
public class LandOnOwnersShoulderGoal_583116333Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__1043049027(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1043049027L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__331323732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-331323732L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_453432674(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(453432674L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInterruptable()Z", cancellable = true)
    private void isInterruptable__25996656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-25996656L))
            info.setReturnValue(true);
    }


}
