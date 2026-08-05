package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.VibrationParticleOption.class)
public class VibrationParticleOption2001230943Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType__2018532027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2018532027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDestination()Lnet/minecraft/world/level/gameevent/PositionSource;", cancellable = true)
    private void getDestination__1622879098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1622879098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getArrivalInTicks()I", cancellable = true)
    private void getArrivalInTicks_2039493189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2039493189L))
            info.setReturnValue(479959178);
    }


}
