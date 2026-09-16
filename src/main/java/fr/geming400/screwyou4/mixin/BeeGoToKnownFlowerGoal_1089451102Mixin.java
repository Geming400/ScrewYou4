package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.bee.Bee.BeeGoToKnownFlowerGoal.class)
public class BeeGoToKnownFlowerGoal_1089451102Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__536714258(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-536714258L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1628412850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1628412850L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_175139997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(175139997L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_959767443(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(959767443L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBeeContinueToUse()Z", cancellable = true)
    private void canBeeContinueToUse_981629633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(981629633L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_399944767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399944767L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canBeeUse()Z", cancellable = true)
    private void canBeeUse_2054210975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2054210975L))
            info.setReturnValue(true);
    }


}
