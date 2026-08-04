package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.builders.CubeDeformation.class)
public class CubeDeformation_1336639891Mixin {
        @Inject(at = @At("HEAD"), method = "extend(FFF)Lnet/minecraft/client/model/geom/builders/CubeDeformation;", cancellable = true)
    private void extend_573695913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(573695913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extend(F)Lnet/minecraft/client/model/geom/builders/CubeDeformation;", cancellable = true)
    private void extend__487679767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-487679767L))
            info.setReturnValue(null);
    }


}
