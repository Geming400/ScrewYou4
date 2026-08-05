package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.FloatGoal.class)
public class FloatGoal1934563489Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1020123425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1020123425L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1804879831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1804879831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick__1620738057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620738057L))
            info.setReturnValue(true);
    }


}
