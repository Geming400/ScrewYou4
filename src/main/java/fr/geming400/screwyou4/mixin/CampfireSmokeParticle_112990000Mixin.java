package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.CampfireSmokeParticle.class)
public class CampfireSmokeParticle_112990000Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__485353443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-485353443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__16693659(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-16693659L))
            info.cancel();
    }


}
