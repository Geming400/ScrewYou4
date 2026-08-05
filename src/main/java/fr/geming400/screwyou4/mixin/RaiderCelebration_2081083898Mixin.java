package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.raid.Raider.RaiderCelebration.class)
public class RaiderCelebration_2081083898Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_454918538(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(454918538L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__636780054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-636780054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1166643833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166643833L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1951400239(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1951400239L))
            info.cancel();
    }


}
