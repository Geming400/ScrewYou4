package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.HeartParticle.class)
public class HeartParticle805735710Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_207392268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(207392268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__1824380267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1824380267L))
            info.setReturnValue(1.394666E8F);
    }


}
