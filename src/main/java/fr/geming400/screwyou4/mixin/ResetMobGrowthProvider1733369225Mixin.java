package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SimpleVerticalParticle.ResetMobGrowthProvider.class)
public class ResetMobGrowthProvider1733369225Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_824742957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(824742957L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1791174546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1791174546L))
            info.setReturnValue("A6B'R%=)\u8140YOk\u3EAEKnup>09y\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2004245980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2004245980L))
            info.setReturnValue(-774552849);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/client/particle/SpriteSet;", cancellable = true)
    private void sprite_30010788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(30010788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/SimpleParticleType;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle_2120882588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2120882588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__1240183994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1240183994L))
            info.setReturnValue(null);
    }


}
