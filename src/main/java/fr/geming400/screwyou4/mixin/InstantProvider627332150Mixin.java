package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SpellParticle.InstantProvider.class)
public class InstantProvider627332150Mixin {
        @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/SpellParticleOption;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle_355256778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(355256778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__1806726699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1806726699L))
            info.setReturnValue(null);
    }


}
