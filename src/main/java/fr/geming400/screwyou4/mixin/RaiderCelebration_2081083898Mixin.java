package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.raid.Raider.RaiderCelebration.class)
public class RaiderCelebration_2081083898Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_2119358636(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2119358636L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_2119358636(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2119358636L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_2119362480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2119362480L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2119358636(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2119358636L))
            info.cancel();
    }


}
