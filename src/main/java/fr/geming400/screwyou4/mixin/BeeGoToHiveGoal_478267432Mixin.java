package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.bee.Bee.BeeGoToHiveGoal.class)
public class BeeGoToHiveGoal_478267432Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__1147897928(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1147897928L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_2055370776(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2055370776L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__436043673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436043673L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_348583773(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(348583773L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse__211238903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-211238903L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canBeeContinueToUse()Z", cancellable = true)
    private void canBeeContinueToUse_370445963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370445963L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canBeeUse()Z", cancellable = true)
    private void canBeeUse_1443027305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1443027305L))
            info.setReturnValue(false);
    }


}
