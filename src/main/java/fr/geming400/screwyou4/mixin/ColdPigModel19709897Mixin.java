package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.pig.ColdPigModel.class)
public class ColdPigModel19709897Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer(Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1525942199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1525942199L))
            info.setReturnValue(null);
    }


}
