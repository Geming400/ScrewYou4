package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.DustParticleOptions.class)
public class DustParticleOptions_912769672Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_1187973997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1187973997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lorg/joml/Vector3f;", cancellable = true)
    private void getColor_376180053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(376180053L))
            info.setReturnValue(null);
    }


}
