package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SimpleVerticalParticle.PauseMobGrowthProvider.class)
public class PauseMobGrowthProvider1903488386Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_994862118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(994862118L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1621055385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1621055385L))
            info.setReturnValue("lr0_9LrvsS*\u17A4<|ct+wUDr>fcm\"]\uA527,sc;cyto*\uC320c=m\uF9297\uB0A0B}a^MK\u1EC40kFm?93Z!H\u6920^aejX4A+1;Qp@Ee'W}IX\"O&%D\u8DC3K4wnJ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1834126819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1834126819L))
            info.setReturnValue(248480544);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/client/particle/SpriteSet;", cancellable = true)
    private void sprite_200129949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(200129949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/SimpleParticleType;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__2003965547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2003965547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__1070064833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1070064833L))
            info.setReturnValue(null);
    }


}
