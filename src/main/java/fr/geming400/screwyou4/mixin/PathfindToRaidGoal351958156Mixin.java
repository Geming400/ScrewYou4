package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.PathfindToRaidGoal.class)
public class PathfindToRaidGoal351958156Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__562481908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-562481908L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_222274498(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(222274498L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse__337677138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-337677138L))
            info.setReturnValue(false);
    }


}
