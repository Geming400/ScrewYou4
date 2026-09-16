package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SculkChargePopParticle.Provider.class)
public class Provider1986381312Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1077755044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077755044L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1538162459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1538162459L))
            info.setReturnValue("5\u2EE3%IS3[t\"V5iXK\u2023>(\u8695<\u12E4BvW69xcNw9#ZAdk\"ax,3L.LTVI\u8F1E\u2C390+u=}5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1751233893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751233893L))
            info.setReturnValue(2013146932);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/client/particle/SpriteSet;", cancellable = true)
    private void sprite_283022875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(283022875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/SimpleParticleType;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__1921072621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921072621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__987171907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-987171907L))
            info.setReturnValue(null);
    }


}
