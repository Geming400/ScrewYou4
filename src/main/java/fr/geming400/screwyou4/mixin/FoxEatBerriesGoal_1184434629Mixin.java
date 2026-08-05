package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fox.Fox.FoxEatBerriesGoal.class)
public class FoxEatBerriesGoal_1184434629Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1222709367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1222709367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1222713211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1222713211L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1222709367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1222709367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRecalculatePath()Z", cancellable = true)
    private void shouldRecalculatePath_1222713211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1222713211L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "acceptedDistance()D", cancellable = true)
    private void acceptedDistance_1222692069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1222692069L))
            info.setReturnValue(4.764259007341456E8D);
    }


}
