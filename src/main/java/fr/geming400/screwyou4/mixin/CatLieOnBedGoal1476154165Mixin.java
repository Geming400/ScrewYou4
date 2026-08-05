package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.CatLieOnBedGoal.class)
public class CatLieOnBedGoal1476154165Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__150011194(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-150011194L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1241709786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1241709786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_561714101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561714101L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1346470507(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1346470507L))
            info.cancel();
    }


}
