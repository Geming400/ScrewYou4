package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.StructureManager.class)
public class StructureManager_498702148Mixin {
        @Inject(at = @At("HEAD"), method = "setStartForStructure(Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/levelgen/structure/Structure;Lnet/minecraft/world/level/levelgen/structure/StructureStart;Lnet/minecraft/world/level/chunk/StructureAccess;)V", cancellable = true)
    private void setStartForStructure__727507558(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-727507558L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStartForStructure(Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/levelgen/structure/Structure;Lnet/minecraft/world/level/chunk/StructureAccess;)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private void getStartForStructure_259127752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259127752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addReferenceForStructure(Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/levelgen/structure/Structure;JLnet/minecraft/world/level/chunk/StructureAccess;)V", cancellable = true)
    private void addReferenceForStructure__536032763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-536032763L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forWorldGenRegion(Lnet/minecraft/server/level/WorldGenRegion;)Lnet/minecraft/world/level/StructureManager;", cancellable = true)
    private void forWorldGenRegion__218660391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-218660391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureAt(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/Structure;)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private void getStructureAt__957134808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-957134808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAnyStructureAt(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void hasAnyStructureAt_667472590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(667472590L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess_508178890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508178890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldGenerateStructures()Z", cancellable = true)
    private void shouldGenerateStructures_536980730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536980730L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkStructurePresence(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/levelgen/structure/Structure;Lnet/minecraft/world/level/levelgen/structure/placement/StructurePlacement;Z)Lnet/minecraft/world/level/levelgen/structure/StructureCheckResult;", cancellable = true)
    private void checkStructurePresence__1100117041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1100117041L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.StructureCheckResult.START_NOT_PRESENT);
    }

    @Inject(at = @At("HEAD"), method = "startsForStructure(Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/levelgen/structure/Structure;)Ljava/util/List;", cancellable = true)
    private void startsForStructure__863348856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-863348856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startsForStructure(Lnet/minecraft/world/level/ChunkPos;Ljava/util/function/Predicate;)Ljava/util/List;", cancellable = true)
    private void startsForStructure_32407448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(32407448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addReference(Lnet/minecraft/world/level/levelgen/structure/StructureStart;)V", cancellable = true)
    private void addReference_485643067(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(485643067L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillStartsForStructure(Lnet/minecraft/world/level/levelgen/structure/Structure;Lit/unimi/dsi/fastutil/longs/LongSet;Ljava/util/function/Consumer;)V", cancellable = true)
    private void fillStartsForStructure__1536203519(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1536203519L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "structureHasPieceAt(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/StructureStart;)Z", cancellable = true)
    private void structureHasPieceAt_73518315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73518315L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAllStructuresAt(Lnet/minecraft/core/BlockPos;)Ljava/util/Map;", cancellable = true)
    private void getAllStructuresAt_634640639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(634640639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureWithPieceAt(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private void getStructureWithPieceAt__176865122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-176865122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureWithPieceAt(Lnet/minecraft/core/BlockPos;Lnet/minecraft/tags/TagKey;)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private void getStructureWithPieceAt_258697809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(258697809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureWithPieceAt(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/Structure;)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private void getStructureWithPieceAt__957134808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-957134808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureWithPieceAt(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private void getStructureWithPieceAt__343704488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-343704488L))
            info.setReturnValue(null);
    }


}
