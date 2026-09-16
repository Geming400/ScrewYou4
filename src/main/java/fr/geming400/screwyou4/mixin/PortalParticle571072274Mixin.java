package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.PortalParticle.class)
public class PortalParticle571072274Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__27271168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-27271168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(DDD)V", cancellable = true)
    private void move__790389494(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-790389494L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_441388616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(441388616L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__2059043703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059043703L))
            info.setReturnValue(2.557577E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_587760652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(587760652L))
            info.setReturnValue(2074519441);
    }


}
