package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.SelectItemModelProperties.class)
public class SelectItemModelProperties1353434335Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap()V", cancellable = true)
    private static void bootstrap_1391709322(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1391709322L))
            info.cancel();
    }


}
