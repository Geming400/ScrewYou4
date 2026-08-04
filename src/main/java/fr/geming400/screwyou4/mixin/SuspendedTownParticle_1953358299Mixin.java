package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SuspendedTownParticle.class)
public class SuspendedTownParticle_1953358299Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__198133331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-198133331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(DDD)V", cancellable = true)
    private void move_882951425(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(882951425L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1991633037(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1991633037L))
            info.cancel();
    }


}
