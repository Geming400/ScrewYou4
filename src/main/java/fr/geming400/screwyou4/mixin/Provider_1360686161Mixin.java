package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SculkChargeParticle.Provider.class)
public class Provider_1360686161Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_452059892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452059892L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2131109685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131109685L))
            info.setReturnValue("\"\uB00EicCF\uCFE2*J#!3\u6A0D%@LB\u6171{X");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1918038251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918038251L))
            info.setReturnValue(-1559798853);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/SculkChargeParticleOptions;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle_335170037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(335170037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__1612867059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612867059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/client/particle/SpriteSet;", cancellable = true)
    private void sprite__342672277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-342672277L))
            info.setReturnValue(null);
    }


}
