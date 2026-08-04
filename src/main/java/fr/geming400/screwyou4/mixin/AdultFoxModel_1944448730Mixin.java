package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.fox.AdultFoxModel.class)
public class AdultFoxModel_1944448730Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1230316565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1230316565L))
            info.setReturnValue(null);
    }


}
