package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.MinecartSoundInstance.class)
public class MinecartSoundInstance1760037219Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1630353561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1630353561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canStartSilent()Z", cancellable = true)
    private void canStartSilent__1144336877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1144336877L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canPlaySound()Z", cancellable = true)
    private void canPlaySound__1922892369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1922892369L))
            info.setReturnValue(true);
    }


}
