package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.armadillo.BabyArmadilloModel.class)
public class BabyArmadilloModel1625229846Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_911097682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(911097682L))
            info.setReturnValue(null);
    }


}
