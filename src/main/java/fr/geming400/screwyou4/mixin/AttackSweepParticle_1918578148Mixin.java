package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.AttackSweepParticle.class)
public class AttackSweepParticle_1918578148Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_1320234705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320234705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1788894489(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1788894489L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1935266525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1935266525L))
            info.setReturnValue(-1689227143);
    }


}
