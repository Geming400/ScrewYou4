package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.DustParticleOptions.class)
public class DustParticleOptions_912769672Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_1109884349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1109884349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lorg/joml/Vector3f;", cancellable = true)
    private void getColor__1365957368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1365957368L))
            info.setReturnValue(null);
    }


}
