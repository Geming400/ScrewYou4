package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.DragonBreathParticle.Provider.class)
public class Provider1021880470Mixin {
        @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/PowerParticleOption;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__172093267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-172093267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__1412178379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1412178379L))
            info.setReturnValue(null);
    }


}
