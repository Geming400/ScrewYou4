package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.strider.AdultStriderModel.class)
public class AdultStriderModel1759028220Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1044896056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1044896056L))
            info.setReturnValue(null);
    }


}
