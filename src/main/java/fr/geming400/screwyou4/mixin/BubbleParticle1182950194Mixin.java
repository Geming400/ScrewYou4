package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.BubbleParticle.class)
public class BubbleParticle1182950194Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_584606752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(584606752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1053266536(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1053266536L))
            info.cancel();
    }


}
