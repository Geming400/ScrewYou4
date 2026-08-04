package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.fox.BabyFoxModel.class)
public class BabyFoxModel60465240Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__653666924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653666924L))
            info.setReturnValue(null);
    }


}
