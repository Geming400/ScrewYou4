package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.TrailParticle.Provider.class)
public class Provider1002066001Mixin {
        @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/TrailParticleOption;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__1965286073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1965286073L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__1431992848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1431992848L))
            info.setReturnValue(null);
    }


}
