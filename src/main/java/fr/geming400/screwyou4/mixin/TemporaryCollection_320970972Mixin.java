package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.Gizmos.TemporaryCollection.class)
public class TemporaryCollection_320970972Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_359245710(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(359245710L))
            info.cancel();
    }


}
