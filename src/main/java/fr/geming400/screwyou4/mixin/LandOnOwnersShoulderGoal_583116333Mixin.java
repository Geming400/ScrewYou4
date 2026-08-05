package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.LandOnOwnersShoulderGoal.class)
public class LandOnOwnersShoulderGoal_583116333Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_621391071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(621391071L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_621394915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621394915L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_621391071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(621391071L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInterruptable()Z", cancellable = true)
    private void isInterruptable_621394915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621394915L))
            info.setReturnValue(false);
    }


}
