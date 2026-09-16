package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ParticleUtils.class)
public class ParticleUtils1075868637Mixin {
        @Inject(at = @At("HEAD"), method = "spawnSmashAttackParticles(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private static void spawnSmashAttackParticles__117376903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-117376903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnParticlesOnBlockFace(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/util/valueproviders/IntProvider;Lnet/minecraft/core/Direction;Ljava/util/function/Supplier;D)V", cancellable = true)
    private static void spawnParticlesOnBlockFace__428150961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-428150961L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnParticlesOnBlockFaces(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/util/valueproviders/IntProvider;)V", cancellable = true)
    private static void spawnParticlesOnBlockFaces__1818340540(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1818340540L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnParticleOnFace(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/world/phys/Vec3;D)V", cancellable = true)
    private static void spawnParticleOnFace_1188745945(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1188745945L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnParticles(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;IDDZLnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private static void spawnParticles_1930318344(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1930318344L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnParticleBelow(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private static void spawnParticleBelow__126503960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-126503960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnParticlesAlongAxis(Lnet/minecraft/core/Direction$Axis;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;DLnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/util/valueproviders/UniformInt;)V", cancellable = true)
    private static void spawnParticlesAlongAxis_1497683834(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1497683834L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnParticleInBlock(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;ILnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private static void spawnParticleInBlock_44538673(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(44538673L))
            info.cancel();
    }


}
