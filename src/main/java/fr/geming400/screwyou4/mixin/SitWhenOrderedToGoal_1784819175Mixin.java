package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.SitWhenOrderedToGoal.class)
public class SitWhenOrderedToGoal_1784819175Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1823093913(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1823093913L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1823093913(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1823093913L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1823097757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823097757L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1823097757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823097757L))
            info.setReturnValue(true);
    }


}
