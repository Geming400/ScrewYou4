package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.ModelLayers.class)
public class ModelLayers172739741Mixin {
        @Inject(at = @At("HEAD"), method = "getKnownLocations()Ljava/util/stream/Stream;", cancellable = true)
    private static void getKnownLocations__37966326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-37966326L))
            info.setReturnValue(null);
    }


}
