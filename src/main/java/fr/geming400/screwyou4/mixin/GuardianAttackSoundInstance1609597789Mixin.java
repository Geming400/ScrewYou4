package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.GuardianAttackSoundInstance.class)
public class GuardianAttackSoundInstance1609597789Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1479914131(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1479914131L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPlaySound()Z", cancellable = true)
    private void canPlaySound__2073331799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073331799L))
            info.setReturnValue(true);
    }


}
