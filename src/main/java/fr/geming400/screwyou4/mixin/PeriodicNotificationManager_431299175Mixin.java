package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.PeriodicNotificationManager.class)
public class PeriodicNotificationManager_431299175Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_469573913(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(469573913L))
            info.cancel();
    }


}
