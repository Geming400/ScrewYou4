package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.raid.Raider.ObtainRaidLeaderBannerGoal.class)
public class ObtainRaidLeaderBannerGoal932003606Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__694161753(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-694161753L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1785860345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1785860345L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_17563542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(17563542L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_802319948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(802319948L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_242368312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(242368312L))
            info.setReturnValue(true);
    }


}
