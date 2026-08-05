package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.MinecartSoundInstance.class)
public class MinecartSoundInstance1760037219Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1798311958(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1798311958L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPlaySound()Z", cancellable = true)
    private void canPlaySound_1798315802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1798315802L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canStartSilent()Z", cancellable = true)
    private void canStartSilent_1798315802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1798315802L))
            info.setReturnValue(false);
    }


}
