package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.BubbleParticle.class)
public class BubbleParticle1182950194Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__968541435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968541435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1221224933(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1221224933L))
            info.cancel();
    }


}
