package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.DataGenerator.Cached.class)
public class Cached1452523387Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run__2079331709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2079331709L))
            info.cancel();
    }


}
