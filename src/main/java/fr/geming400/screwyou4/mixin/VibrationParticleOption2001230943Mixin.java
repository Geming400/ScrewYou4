package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.VibrationParticleOption.class)
public class VibrationParticleOption2001230943Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType__2096621675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096621675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDestination()Lnet/minecraft/world/level/gameevent/PositionSource;", cancellable = true)
    private void getDestination_564328286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(564328286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getArrivalInTicks()I", cancellable = true)
    private void getArrivalInTicks__1999253513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1999253513L))
            info.setReturnValue(-48987869);
    }


}
