package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.DragonBreathParticle.class)
public class DragonBreathParticle937407737Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_339064295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339064295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_807724079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(807724079L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__1692708240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1692708240L))
            info.setReturnValue(5.947469E8F);
    }


}
