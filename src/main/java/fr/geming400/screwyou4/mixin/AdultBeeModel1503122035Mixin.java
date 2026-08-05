package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.bee.AdultBeeModel.class)
public class AdultBeeModel1503122035Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__400532574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-400532574L))
            info.setReturnValue(null);
    }


}
