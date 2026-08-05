package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fox.Fox.FoxPounceGoal.class)
public class FoxPounceGoal_76497351Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_114772089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(114772089L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_114772089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(114772089L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_114775933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114775933L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_114772089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(114772089L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInterruptable()Z", cancellable = true)
    private void isInterruptable_114775933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114775933L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_114775933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114775933L))
            info.setReturnValue(true);
    }


}
