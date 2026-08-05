package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.carver.CaveWorldCarver.class)
public class CaveWorldCarver822952806Mixin {
        @Inject(at = @At("HEAD"), method = "carve(Lnet/minecraft/world/level/levelgen/carver/CarvingContext;Lnet/minecraft/world/level/levelgen/carver/CarverConfiguration;Lnet/minecraft/world/level/chunk/ChunkAccess;Ljava/util/function/Function;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/Aquifer;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/CarvingMask;)Z", cancellable = true)
    private void carve_1728873593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1728873593L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "carve(Lnet/minecraft/world/level/levelgen/carver/CarvingContext;Lnet/minecraft/world/level/levelgen/carver/CaveCarverConfiguration;Lnet/minecraft/world/level/chunk/ChunkAccess;Ljava/util/function/Function;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/Aquifer;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/CarvingMask;)Z", cancellable = true)
    private void carve_117174630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(117174630L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isStartChunk(Lnet/minecraft/world/level/levelgen/carver/CaveCarverConfiguration;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void isStartChunk__606993433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-606993433L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isStartChunk(Lnet/minecraft/world/level/levelgen/carver/CarverConfiguration;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void isStartChunk__2043423692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043423692L))
            info.setReturnValue(false);
    }


}
