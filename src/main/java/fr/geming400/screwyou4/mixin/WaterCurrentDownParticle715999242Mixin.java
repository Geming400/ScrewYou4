package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.WaterCurrentDownParticle.class)
public class WaterCurrentDownParticle715999242Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1435492387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1435492387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_754273981(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(754273981L))
            info.cancel();
    }


}
