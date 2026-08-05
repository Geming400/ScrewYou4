package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.turtle.BabyTurtleModel.class)
public class BabyTurtleModel_894260823Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1009393787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1009393787L))
            info.setReturnValue(null);
    }


}
