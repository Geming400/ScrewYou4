package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.PortalParticle.class)
public class PortalParticle571072274Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1580419355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1580419355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(DDD)V", cancellable = true)
    private void move__499334599(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-499334599L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_609347013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(609347013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize_1782203307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1782203307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1782206190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1782206190L))
            info.setReturnValue(null);
    }


}
