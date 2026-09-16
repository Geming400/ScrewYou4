package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fox.Fox.FoxEatBerriesGoal.class)
public class FoxEatBerriesGoal_1184434629Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__441730731(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-441730731L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_269994564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(269994564L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1054750970(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1054750970L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acceptedDistance()D", cancellable = true)
    private void acceptedDistance__264574551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-264574551L))
            info.setReturnValue(4.718189008806269E8D);
    }

    @Inject(at = @At("HEAD"), method = "shouldRecalculatePath()Z", cancellable = true)
    private void shouldRecalculatePath_1995150198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1995150198L))
            info.setReturnValue(true);
    }


}
