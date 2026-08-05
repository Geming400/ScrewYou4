package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.raid.Raider.ObtainRaidLeaderBannerGoal.class)
public class ObtainRaidLeaderBannerGoal932003606Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_970278345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(970278345L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_970278345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(970278345L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_970282189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970282189L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_970278345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(970278345L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_970282189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970282189L))
            info.setReturnValue(true);
    }


}
