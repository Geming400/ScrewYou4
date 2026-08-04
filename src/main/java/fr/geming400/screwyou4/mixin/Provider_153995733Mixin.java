package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.GeyserPlumeParticle.Provider.class)
public class Provider_153995733Mixin {
        @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/GeyserParticleOptions;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle_1420740984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420740984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle_2014904179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2014904179L))
            info.setReturnValue(null);
    }


}
