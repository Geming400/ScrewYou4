package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.ItemTintSources.class)
public class ItemTintSources332179100Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap()V", cancellable = true)
    private static void bootstrap_370454087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(370454087L))
            info.cancel();
    }


}
