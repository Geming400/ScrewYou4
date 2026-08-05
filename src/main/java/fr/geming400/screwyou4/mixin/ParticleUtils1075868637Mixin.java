package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ParticleUtils.class)
public class ParticleUtils1075868637Mixin {
        @Inject(at = @At("HEAD"), method = "spawnParticleBelow(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private static void spawnParticleBelow_472164952(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(472164952L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnParticlesAlongAxis(Lnet/minecraft/core/Direction$Axis;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;DLnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/util/valueproviders/UniformInt;)V", cancellable = true)
    private static void spawnParticlesAlongAxis__1557572282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1557572282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnParticleInBlock(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;ILnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private static void spawnParticleInBlock_333618666(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(333618666L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnParticles(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;IDDZLnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private static void spawnParticles__1655261638(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1655261638L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnSmashAttackParticles(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private static void spawnSmashAttackParticles__9904491(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-9904491L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnParticlesOnBlockFaces(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/util/valueproviders/IntProvider;)V", cancellable = true)
    private static void spawnParticlesOnBlockFaces__2026182582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2026182582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnParticlesOnBlockFace(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/util/valueproviders/IntProvider;Lnet/minecraft/core/Direction;Ljava/util/function/Supplier;D)V", cancellable = true)
    private static void spawnParticlesOnBlockFace__1816226250(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1816226250L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnParticleOnFace(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/world/phys/Vec3;D)V", cancellable = true)
    private static void spawnParticleOnFace_1039945686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1039945686L))
            info.cancel();
    }


}
