package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.banner.BannerModel.class)
public class BannerModel1520530127Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer(Z)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_850337601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850337601L))
            info.setReturnValue(null);
    }


}
