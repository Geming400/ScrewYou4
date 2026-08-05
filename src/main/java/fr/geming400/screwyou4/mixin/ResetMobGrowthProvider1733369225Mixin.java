package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SimpleVerticalParticle.ResetMobGrowthProvider.class)
public class ResetMobGrowthProvider1733369225Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1176085812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176085812L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_597909250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597909250L))
            info.setReturnValue("cuzc]z>9(5gnVz\"5y.cQg1*?dQ@僡\")P⥊@@t^_05^mU;ivKMM");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1771631967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771631967L))
            info.setReturnValue(1352346287);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/client/particle/SpriteSet;", cancellable = true)
    private void sprite_153859145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153859145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/SimpleParticleType;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__1864929670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1864929670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__700689624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-700689624L))
            info.setReturnValue(null);
    }


}
