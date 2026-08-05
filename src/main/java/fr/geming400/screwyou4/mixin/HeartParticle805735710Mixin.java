package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.HeartParticle.class)
public class HeartParticle805735710Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1345755919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1345755919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize_2016866743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2016866743L))
            info.setReturnValue(6.262639E8F);
    }


}
