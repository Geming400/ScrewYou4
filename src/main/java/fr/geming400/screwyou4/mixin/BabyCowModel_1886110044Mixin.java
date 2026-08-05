package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.cow.BabyCowModel.class)
public class BabyCowModel_1886110044Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__17544566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-17544566L))
            info.setReturnValue(null);
    }


}
