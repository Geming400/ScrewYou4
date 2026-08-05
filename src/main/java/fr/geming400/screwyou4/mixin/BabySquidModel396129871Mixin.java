package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.squid.BabySquidModel.class)
public class BabySquidModel396129871Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1507524738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1507524738L))
            info.setReturnValue(null);
    }


}
