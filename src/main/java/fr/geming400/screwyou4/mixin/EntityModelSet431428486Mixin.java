package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.EntityModelSet.class)
public class EntityModelSet431428486Mixin {
        @Inject(at = @At("HEAD"), method = "bakeLayer(Lnet/minecraft/client/model/geom/ModelLayerLocation;)Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void bakeLayer_1439543144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1439543144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vanilla()Lnet/minecraft/client/model/geom/EntityModelSet;", cancellable = true)
    private static void vanilla_1682654286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1682654286L))
            info.setReturnValue(null);
    }


}
