package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.polarbear.BabyPolarBearModel.class)
public class BabyPolarBearModel1828387567Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1114255403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114255403L))
            info.setReturnValue(null);
    }


}
