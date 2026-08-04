package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.sheep.BabySheepModel.class)
public class BabySheepModel950033908Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_235901744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235901744L))
            info.setReturnValue(null);
    }


}
