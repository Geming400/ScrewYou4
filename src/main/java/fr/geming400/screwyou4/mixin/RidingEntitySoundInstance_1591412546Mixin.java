package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.RidingEntitySoundInstance.class)
public class RidingEntitySoundInstance_1591412546Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1629687284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1629687284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPlaySound()Z", cancellable = true)
    private void canPlaySound_1629691128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629691128L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canStartSilent()Z", cancellable = true)
    private void canStartSilent_1629691128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629691128L))
            info.setReturnValue(false);
    }


}
