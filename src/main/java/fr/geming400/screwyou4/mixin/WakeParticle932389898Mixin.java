package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.WakeParticle.class)
public class WakeParticle932389898Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1219101731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1219101731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_970664637(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(970664637L))
            info.cancel();
    }


}
