package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.bee.BeeStingerModel.class)
public class BeeStingerModel_2135752465Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1421620300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1421620300L))
            info.setReturnValue(null);
    }


}
