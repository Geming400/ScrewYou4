package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SculkChargeParticle.Provider.class)
public class Provider_1360686161Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1548768877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1548768877L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_225226185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225226185L))
            info.setReturnValue("X@{[^!!sn\uA21F%|x%2rN'[P{\uC3DEEEEkv?rT\u285FG7+F^|'H&w^aI!pI\u2C49P,\u7C40TaTC|Dl\u3F01nX\uC355EB\u4B08%y2\u0A1An;\u839CAfMUU4%vG");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1398948902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398948902L))
            info.setReturnValue(-2107640462);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/client/particle/SpriteSet;", cancellable = true)
    private void sprite__218823920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-218823920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/SculkChargeParticleOptions;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle_1898701011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1898701011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__1073372689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1073372689L))
            info.setReturnValue(null);
    }


}
