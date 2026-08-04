package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.bee.BabyBeeModel.class)
public class BabyBeeModel_1152218145Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_438085980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(438085980L))
            info.setReturnValue(null);
    }


}
