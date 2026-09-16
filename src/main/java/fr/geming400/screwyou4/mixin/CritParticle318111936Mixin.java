package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.CritParticle.class)
public class CritParticle318111936Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__280231506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-280231506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_188428278(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(188428278L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize_1982963255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1982963255L))
            info.setReturnValue(4.503819E8F);
    }


}
