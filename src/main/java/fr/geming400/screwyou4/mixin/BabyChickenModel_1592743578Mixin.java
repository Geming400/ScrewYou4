package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.chicken.BabyChickenModel.class)
public class BabyChickenModel_1592743578Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__310911032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-310911032L))
            info.setReturnValue(null);
    }


}
