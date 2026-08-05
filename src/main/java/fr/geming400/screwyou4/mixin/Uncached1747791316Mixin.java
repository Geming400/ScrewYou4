package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.DataGenerator.Uncached.class)
public class Uncached1747791316Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run__1784063780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1784063780L))
            info.cancel();
    }


}
