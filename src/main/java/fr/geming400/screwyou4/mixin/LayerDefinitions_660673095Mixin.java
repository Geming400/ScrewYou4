package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.LayerDefinitions.class)
public class LayerDefinitions_660673095Mixin {
        @Inject(at = @At("HEAD"), method = "createRoots()Ljava/util/Map;", cancellable = true)
    private static void createRoots_183897041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183897041L))
            info.setReturnValue(null);
    }


}
