package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.ShriekParticleOption.class)
public class ShriekParticleOption_1520514629Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_1717629306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717629306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDelay()I", cancellable = true)
    private void getDelay__477133699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-477133699L))
            info.setReturnValue(-1938651653);
    }


}
