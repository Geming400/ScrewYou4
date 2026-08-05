package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.TerrainParticle.class)
public class TerrainParticle1487682317Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_889338875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889338875L))
            info.setReturnValue(null);
    }


}
