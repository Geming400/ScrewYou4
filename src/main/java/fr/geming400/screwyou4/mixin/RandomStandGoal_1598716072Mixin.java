package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RandomStandGoal.class)
public class RandomStandGoal_1598716072Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__27449288(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-27449288L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_684276007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(684276007L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick__1956585475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1956585475L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_909080777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(909080777L))
            info.setReturnValue(true);
    }


}
