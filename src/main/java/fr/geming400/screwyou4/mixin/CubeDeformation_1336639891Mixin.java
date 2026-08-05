package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.builders.CubeDeformation.class)
public class CubeDeformation_1336639891Mixin {
        @Inject(at = @At("HEAD"), method = "extend(FFF)Lnet/minecraft/client/model/geom/builders/CubeDeformation;", cancellable = true)
    private void extend_1672141775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1672141775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extend(F)Lnet/minecraft/client/model/geom/builders/CubeDeformation;", cancellable = true)
    private void extend__1438490993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1438490993L))
            info.setReturnValue(null);
    }


}
