package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.CatSitOnBlockGoal.class)
public class CatSitOnBlockGoal_1039175573Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__586989787(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-586989787L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1678688379(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1678688379L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_124735508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(124735508L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_909491914(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(909491914L))
            info.cancel();
    }


}
