package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.OfferFlowerGoal.class)
public class OfferFlowerGoal_1988030628Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_361865268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(361865268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__729833324(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-729833324L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1073590563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1073590563L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1858346969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1858346969L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1298395333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298395333L))
            info.setReturnValue(true);
    }


}
