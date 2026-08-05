package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.MoveThroughVillageGoal.class)
public class MoveThroughVillageGoal_394175871Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__1231989489(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1231989489L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1971279215(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1971279215L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__520264194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-520264194L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse__295459424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-295459424L))
            info.setReturnValue(false);
    }


}
