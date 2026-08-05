package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.dolphin.BabyDolphinModel.class)
public class BabyDolphinModel_101462197Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1802192413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1802192413L))
            info.setReturnValue(null);
    }


}
