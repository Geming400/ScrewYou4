package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SoulParticle.class)
public class SoulParticle444051865Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__154291577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-154291577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_314368207(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(314368207L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_460740243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(460740243L))
            info.setReturnValue(77315701);
    }


}
