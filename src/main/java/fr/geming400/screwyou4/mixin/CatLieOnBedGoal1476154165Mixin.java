package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.CatLieOnBedGoal.class)
public class CatLieOnBedGoal1476154165Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1514428904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1514428904L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1514428904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1514428904L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1514432748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514432748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1514428904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1514428904L))
            info.cancel();
    }


}
