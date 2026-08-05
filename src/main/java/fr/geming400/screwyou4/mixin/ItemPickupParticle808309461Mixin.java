package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.ItemPickupParticle.class)
public class ItemPickupParticle808309461Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_678625803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(678625803L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGroup()Lnet/minecraft/client/particle/ParticleRenderType;", cancellable = true)
    private void getGroup_889547581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889547581L))
            info.setReturnValue(null);
    }


}
