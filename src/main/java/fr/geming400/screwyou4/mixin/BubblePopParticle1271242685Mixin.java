package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.BubblePopParticle.class)
public class BubblePopParticle1271242685Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_672899243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672899243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1141559027(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1141559027L))
            info.cancel();
    }


}
