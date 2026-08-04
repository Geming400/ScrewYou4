package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.wolf.AdultWolfModel.class)
public class AdultWolfModel_1872408209Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer(Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createBodyLayer_1205427520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205427520L))
            info.setReturnValue(null);
    }


}
