package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.carver.CanyonWorldCarver.class)
public class CanyonWorldCarver_601645621Mixin {
        @Inject(at = @At("HEAD"), method = "isStartChunk(Lnet/minecraft/world/level/levelgen/carver/CarverConfiguration;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void isStartChunk_2030236418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2030236418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isStartChunk(Lnet/minecraft/world/level/levelgen/carver/CanyonCarverConfiguration;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void isStartChunk_1462754202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1462754202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "carve(Lnet/minecraft/world/level/levelgen/carver/CarvingContext;Lnet/minecraft/world/level/levelgen/carver/CarverConfiguration;Lnet/minecraft/world/level/chunk/ChunkAccess;Ljava/util/function/Function;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/Aquifer;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/CarvingMask;)Z", cancellable = true)
    private void carve_1507566407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1507566407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "carve(Lnet/minecraft/world/level/levelgen/carver/CarvingContext;Lnet/minecraft/world/level/levelgen/carver/CanyonCarverConfiguration;Lnet/minecraft/world/level/chunk/ChunkAccess;Ljava/util/function/Function;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/Aquifer;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/CarvingMask;)Z", cancellable = true)
    private void carve__968701585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968701585L))
            info.setReturnValue(null);
    }


}
