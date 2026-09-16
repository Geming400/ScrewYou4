package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.carver.CaveWorldCarver.class)
public class CaveWorldCarver822952806Mixin {
        @Inject(at = @At("HEAD"), method = "carve(Lnet/minecraft/world/level/levelgen/carver/CarvingContext;Lnet/minecraft/world/level/levelgen/carver/CaveCarverConfiguration;Lnet/minecraft/world/level/chunk/ChunkAccess;Ljava/util/function/Function;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/Aquifer;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/CarvingMask;)Z", cancellable = true)
    private void carve__858304727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-858304727L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "carve(Lnet/minecraft/world/level/levelgen/carver/CarvingContext;Lnet/minecraft/world/level/levelgen/carver/CarverConfiguration;Lnet/minecraft/world/level/chunk/ChunkAccess;Ljava/util/function/Function;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/Aquifer;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/CarvingMask;)Z", cancellable = true)
    private void carve_1969961916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969961916L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isStartChunk(Lnet/minecraft/world/level/levelgen/carver/CaveCarverConfiguration;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void isStartChunk_1180830610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1180830610L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isStartChunk(Lnet/minecraft/world/level/levelgen/carver/CarverConfiguration;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void isStartChunk__1665636001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1665636001L))
            info.setReturnValue(false);
    }


}
