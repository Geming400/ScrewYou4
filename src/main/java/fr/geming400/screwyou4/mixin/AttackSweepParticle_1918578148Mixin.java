package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.AttackSweepParticle.class)
public class AttackSweepParticle_1918578148Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__232913482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-232913482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1956852886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1956852886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords__1165255233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1165255233L))
            info.setReturnValue(-705310558);
    }


}
