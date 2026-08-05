package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.UseItemGoal.class)
public class UseItemGoal_1860309633Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1898584371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1898584371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1898584371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1898584371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1898588215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1898588215L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1898588215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1898588215L))
            info.setReturnValue(true);
    }


}
