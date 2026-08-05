package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SculkChargePopParticle.Provider.class)
public class Provider1986381312Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__923073725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-923073725L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_850921337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850921337L))
            info.setReturnValue("@쇐k%sB첣QVzhc綽>K뢬<)f罢Iꒉ揊#Btt&閑R-*eW>NⓅZ茔,6<{Wn[++ge뜔⾥gf`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2024644054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2024644054L))
            info.setReturnValue(-1901077933);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/client/particle/SpriteSet;", cancellable = true)
    private void sprite_406871232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406871232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/SimpleParticleType;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__1611917583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1611917583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__447677537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-447677537L))
            info.setReturnValue(null);
    }


}
