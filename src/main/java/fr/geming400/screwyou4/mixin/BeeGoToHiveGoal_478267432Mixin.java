package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.bee.Bee.BeeGoToHiveGoal.class)
public class BeeGoToHiveGoal_478267432Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_516542170(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(516542170L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_516542170(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(516542170L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_516674974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(516674974L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_516542170(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(516542170L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBeeContinueToUse()Z", cancellable = true)
    private void canBeeContinueToUse_516546014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(516546014L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_516674974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(516674974L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canBeeUse()Z", cancellable = true)
    private void canBeeUse_516546014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(516546014L))
            info.setReturnValue(true);
    }


}
