package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RangedAttackGoal.class)
public class RangedAttackGoal1878731352Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__839132599(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-839132599L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_964291288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(964291288L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1749047694(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1749047694L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick__1676570194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1676570194L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1189096058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1189096058L))
            info.setReturnValue(false);
    }


}
