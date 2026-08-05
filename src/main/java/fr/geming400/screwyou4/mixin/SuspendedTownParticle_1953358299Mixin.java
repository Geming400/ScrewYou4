package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SuspendedTownParticle.class)
public class SuspendedTownParticle_1953358299Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_1355014856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355014856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(DDD)V", cancellable = true)
    private void move_591896530(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(591896530L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1823674640(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1823674640L))
            info.cancel();
    }


}
