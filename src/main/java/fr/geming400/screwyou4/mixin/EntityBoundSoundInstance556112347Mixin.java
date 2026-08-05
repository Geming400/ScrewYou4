package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.EntityBoundSoundInstance.class)
public class EntityBoundSoundInstance556112347Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_426428689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(426428689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPlaySound()Z", cancellable = true)
    private void canPlaySound_1168150055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1168150055L))
            info.setReturnValue(true);
    }


}
