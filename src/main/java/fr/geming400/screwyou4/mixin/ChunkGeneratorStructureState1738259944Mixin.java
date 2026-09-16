package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.ChunkGeneratorStructureState.class)
public class ChunkGeneratorStructureState1738259944Mixin {
        @Inject(at = @At("HEAD"), method = "createForNormal(Lnet/minecraft/world/level/levelgen/RandomState;JLnet/minecraft/world/level/biome/BiomeSource;Lnet/minecraft/core/HolderLookup;)Lnet/minecraft/world/level/chunk/ChunkGeneratorStructureState;", cancellable = true)
    private static void createForNormal__167553640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-167553640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlacementsForStructure(Lnet/minecraft/core/Holder;)Ljava/util/List;", cancellable = true)
    private void getPlacementsForStructure_1244516283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1244516283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelSeed()J", cancellable = true)
    private void getLevelSeed__1403572848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1403572848L))
            info.setReturnValue(-7156775648725628200L);
    }

    @Inject(at = @At("HEAD"), method = "hasStructureChunkInRange(Lnet/minecraft/core/Holder;III)Z", cancellable = true)
    private void hasStructureChunkInRange__1047619131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1047619131L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRingPositionsFor(Lnet/minecraft/world/level/levelgen/structure/placement/ConcentricRingsStructurePlacement;)Ljava/util/List;", cancellable = true)
    private void getRingPositionsFor_1534181588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1534181588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomState()Lnet/minecraft/world/level/levelgen/RandomState;", cancellable = true)
    private void randomState__745547331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-745547331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ensureStructuresGenerated()V", cancellable = true)
    private void ensureStructuresGenerated_78747722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(78747722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "possibleStructureSets()Ljava/util/List;", cancellable = true)
    private void possibleStructureSets_644537099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644537099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createForFlat(Lnet/minecraft/world/level/levelgen/RandomState;JLnet/minecraft/world/level/biome/BiomeSource;Ljava/util/stream/Stream;)Lnet/minecraft/world/level/chunk/ChunkGeneratorStructureState;", cancellable = true)
    private static void createForFlat_1306272531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1306272531L))
            info.setReturnValue(null);
    }


}
