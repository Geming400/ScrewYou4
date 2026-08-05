package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fox.Fox.FoxPounceGoal.class)
public class FoxPounceGoal_76497351Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__1549668009(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1549668009L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1653600695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1653600695L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__837942714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-837942714L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__53186308(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-53186308L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInterruptable()Z", cancellable = true)
    private void isInterruptable__532615638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532615638L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse__613137944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-613137944L))
            info.setReturnValue(false);
    }


}
