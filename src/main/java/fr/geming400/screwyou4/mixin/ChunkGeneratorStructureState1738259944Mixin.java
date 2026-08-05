package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.ChunkGeneratorStructureState.class)
public class ChunkGeneratorStructureState1738259944Mixin {
        @Inject(at = @At("HEAD"), method = "randomState()Lnet/minecraft/world/level/levelgen/RandomState;", cancellable = true)
    private void randomState__1996262609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996262609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ensureStructuresGenerated()V", cancellable = true)
    private void ensureStructuresGenerated_1776534683(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1776534683L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlacementsForStructure(Lnet/minecraft/core/Holder;)Ljava/util/List;", cancellable = true)
    private void getPlacementsForStructure_812704873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(812704873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createForNormal(Lnet/minecraft/world/level/levelgen/RandomState;JLnet/minecraft/world/level/biome/BiomeSource;Lnet/minecraft/core/HolderLookup;)Lnet/minecraft/world/level/chunk/ChunkGeneratorStructureState;", cancellable = true)
    private static void createForNormal_635460748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(635460748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "possibleStructureSets()Ljava/util/List;", cancellable = true)
    private void possibleStructureSets__930370536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930370536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createForFlat(Lnet/minecraft/world/level/levelgen/RandomState;JLnet/minecraft/world/level/biome/BiomeSource;Ljava/util/stream/Stream;)Lnet/minecraft/world/level/chunk/ChunkGeneratorStructureState;", cancellable = true)
    private static void createForFlat_990521241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(990521241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRingPositionsFor(Lnet/minecraft/world/level/levelgen/structure/placement/ConcentricRingsStructurePlacement;)Ljava/util/List;", cancellable = true)
    private void getRingPositionsFor_1114186703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114186703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelSeed()J", cancellable = true)
    private void getLevelSeed_1776523151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1776523151L))
            info.setReturnValue(-8840625183221296506L);
    }

    @Inject(at = @At("HEAD"), method = "hasStructureChunkInRange(Lnet/minecraft/core/Holder;III)Z", cancellable = true)
    private void hasStructureChunkInRange_2103374537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103374537L))
            info.setReturnValue(true);
    }


}
