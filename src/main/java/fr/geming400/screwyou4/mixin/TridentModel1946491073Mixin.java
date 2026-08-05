package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.projectile.TridentModel.class)
public class TridentModel1946491073Mixin {
        @Inject(at = @At("HEAD"), method = "createLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createLayer_286363890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286363890L))
            info.setReturnValue(null);
    }


}
