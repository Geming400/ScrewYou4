package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.GuardianAttackSoundInstance.class)
public class GuardianAttackSoundInstance1609597789Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1647872528(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1647872528L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPlaySound()Z", cancellable = true)
    private void canPlaySound_1647876372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1647876372L))
            info.setReturnValue(null);
    }


}
