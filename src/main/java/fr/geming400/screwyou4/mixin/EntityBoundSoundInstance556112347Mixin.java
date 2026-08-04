package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.EntityBoundSoundInstance.class)
public class EntityBoundSoundInstance556112347Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_594387086(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(594387086L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPlaySound()Z", cancellable = true)
    private void canPlaySound_594390930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(594390930L))
            info.setReturnValue(null);
    }


}
