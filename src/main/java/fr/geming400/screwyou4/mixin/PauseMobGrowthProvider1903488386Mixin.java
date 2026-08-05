package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SimpleVerticalParticle.PauseMobGrowthProvider.class)
public class PauseMobGrowthProvider1903488386Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1005966651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1005966651L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_768028411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(768028411L))
            info.setReturnValue("\u1E79\u071EE;e_Q=76i^!>I\u078EdhXvuJ1A\u080DWZ\u040E\u9161/|YZ_K\u335A\u1ECD(1N#QizIc\uA017& w|w\u3854D?C_/E!V}9\u6D4A 1N1A[CE\u0C08sEZ\u37BA<#mez\u306F\u37FAbI?LQ)O0\uD772");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1941751128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1941751128L))
            info.setReturnValue(758147836);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/SimpleParticleType;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__1694810509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1694810509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticle(Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/client/multiplayer/ClientLevel;DDDDDDLnet/minecraft/util/RandomSource;)Lnet/minecraft/client/particle/Particle;", cancellable = true)
    private void createParticle__530570463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530570463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/client/particle/SpriteSet;", cancellable = true)
    private void sprite_323978306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(323978306L))
            info.setReturnValue(null);
    }


}
