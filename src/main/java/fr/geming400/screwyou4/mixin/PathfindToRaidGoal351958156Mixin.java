package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.PathfindToRaidGoal.class)
public class PathfindToRaidGoal351958156Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_390236739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(390236739L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_390232895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(390232895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_390236739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(390236739L))
            info.setReturnValue(true);
    }


}
