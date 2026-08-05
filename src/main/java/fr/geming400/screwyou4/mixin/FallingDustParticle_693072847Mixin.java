package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.FallingDustParticle.class)
public class FallingDustParticle_693072847Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1458418783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1458418783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_731347585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(731347585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize_1904203879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904203879L))
            info.setReturnValue(9.485812E8F);
    }


}
