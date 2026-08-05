package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SpellParticle.class)
public class SpellParticle_1514640512Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_916297069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(916297069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1384956853(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1384956853L))
            info.cancel();
    }


}
