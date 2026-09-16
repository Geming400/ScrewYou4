package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.FallingDustParticle.class)
public class FallingDustParticle_693072847Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_94729404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(94729404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_563389188(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(563389188L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__1937043131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937043131L))
            info.setReturnValue(4.202866E8F);
    }


}
