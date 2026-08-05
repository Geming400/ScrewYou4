package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.armadillo.BabyArmadilloModel.class)
public class BabyArmadilloModel1625229846Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__278424763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-278424763L))
            info.setReturnValue(null);
    }


}
