package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.MissingCuboidModel.class)
public class MissingCuboidModel1657063141Mixin {
        @Inject(at = @At("HEAD"), method = "missingModel()Lnet/minecraft/client/resources/model/UnbakedModel;", cancellable = true)
    private static void missingModel_619951594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(619951594L))
            info.setReturnValue(null);
    }


}
