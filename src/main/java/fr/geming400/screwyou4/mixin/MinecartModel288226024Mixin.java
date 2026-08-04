package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.cart.MinecartModel.class)
public class MinecartModel288226024Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__425906140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-425906140L))
            info.setReturnValue(null);
    }


}
