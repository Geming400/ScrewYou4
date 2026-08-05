package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.CatSitOnBlockGoal.class)
public class CatSitOnBlockGoal_1039175573Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1077450311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1077450311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1077450311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1077450311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1077454155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077454155L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1077450311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1077450311L))
            info.cancel();
    }


}
