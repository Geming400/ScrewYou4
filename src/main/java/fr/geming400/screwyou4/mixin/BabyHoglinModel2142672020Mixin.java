package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.hoglin.BabyHoglinModel.class)
public class BabyHoglinModel2142672020Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1428539856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1428539856L))
            info.setReturnValue(null);
    }


}
