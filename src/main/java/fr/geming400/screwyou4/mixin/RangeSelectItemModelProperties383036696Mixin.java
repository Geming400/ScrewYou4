package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.RangeSelectItemModelProperties.class)
public class RangeSelectItemModelProperties383036696Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap()V", cancellable = true)
    private static void bootstrap__1055081707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1055081707L))
            info.cancel();
    }


}
