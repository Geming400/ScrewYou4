package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.camel.BabyCamelModel.class)
public class BabyCamelModel_56870845Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__657261320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-657261320L))
            info.setReturnValue(null);
    }


}
