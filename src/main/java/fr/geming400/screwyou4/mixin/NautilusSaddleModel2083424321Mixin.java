package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.nautilus.NautilusSaddleModel.class)
public class NautilusSaddleModel2083424321Mixin {
        @Inject(at = @At("HEAD"), method = "createSaddleLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSaddleLayer_1536367275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1536367275L))
            info.setReturnValue(null);
    }


}
