package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.DragonBreathParticle.class)
public class DragonBreathParticle937407737Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1214083892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1214083892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_975682476(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(975682476L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__2146428526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146428526L))
            info.setReturnValue(4.831481E8F);
    }


}
