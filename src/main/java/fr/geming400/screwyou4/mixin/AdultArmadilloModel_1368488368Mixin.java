package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.armadillo.AdultArmadilloModel.class)
public class AdultArmadilloModel_1368488368Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__535166242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535166242L))
            info.setReturnValue(null);
    }


}
