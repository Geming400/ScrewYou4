package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.slime.SulfurCubeModel.class)
public class SulfurCubeModel_765157299Mixin {
        @Inject(at = @At("HEAD"), method = "createOuterBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createOuterBodyLayer_51025134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(51025134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createInnerBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createInnerBodyLayer_51025134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(51025134L))
            info.setReturnValue(null);
    }


}
