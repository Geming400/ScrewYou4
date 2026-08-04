package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.ConditionalItemModelProperties.class)
public class ConditionalItemModelProperties_1041396071Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap()V", cancellable = true)
    private static void bootstrap_1079671057(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1079671057L))
            info.cancel();
    }


}
