package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.strider.BabyStriderModel.class)
public class BabyStriderModel1699065590Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__204589019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-204589019L))
            info.setReturnValue(null);
    }


}
