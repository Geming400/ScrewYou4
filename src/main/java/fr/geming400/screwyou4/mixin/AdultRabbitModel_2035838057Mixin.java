package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.rabbit.AdultRabbitModel.class)
public class AdultRabbitModel_2035838057Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_132183447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(132183447L))
            info.setReturnValue(null);
    }


}
