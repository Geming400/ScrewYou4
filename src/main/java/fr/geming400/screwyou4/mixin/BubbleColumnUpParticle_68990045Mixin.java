package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.BubbleColumnUpParticle.class)
public class BubbleColumnUpParticle_68990045Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__2082501585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082501585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_107264783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(107264783L))
            info.cancel();
    }


}
