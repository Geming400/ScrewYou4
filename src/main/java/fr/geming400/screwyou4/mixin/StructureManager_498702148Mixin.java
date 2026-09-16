package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.StructureManager.class)
public class StructureManager_498702148Mixin {
        @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess__556191063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-556191063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureWithPieceAt(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private void getStructureWithPieceAt__288084804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-288084804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureWithPieceAt(Lnet/minecraft/core/BlockPos;Lnet/minecraft/tags/TagKey;)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private void getStructureWithPieceAt__946134285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-946134285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureWithPieceAt(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private void getStructureWithPieceAt__454924170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-454924170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureWithPieceAt(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/Structure;)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private void getStructureWithPieceAt_432220870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432220870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillStartsForStructure(Lnet/minecraft/world/level/levelgen/structure/Structure;Lit/unimi/dsi/fastutil/longs/LongSet;Ljava/util/function/Consumer;)V", cancellable = true)
    private void fillStartsForStructure__238942013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-238942013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAllStructuresAt(Lnet/minecraft/core/BlockPos;)Ljava/util/Map;", cancellable = true)
    private void getAllStructuresAt__402649923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-402649923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkStructurePresence(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/levelgen/structure/Structure;Lnet/minecraft/world/level/levelgen/structure/placement/StructurePlacement;Z)Lnet/minecraft/world/level/levelgen/structure/StructureCheckResult;", cancellable = true)
    private void checkStructurePresence_830186409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830186409L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.StructureCheckResult.CHUNK_LOAD_NEEDED);
    }

    @Inject(at = @At("HEAD"), method = "addReference(Lnet/minecraft/world/level/levelgen/structure/StructureStart;)V", cancellable = true)
    private void addReference__408761243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-408761243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startsForStructure(Lnet/minecraft/world/level/ChunkPos;Ljava/util/function/Predicate;)Ljava/util/List;", cancellable = true)
    private void startsForStructure_1072262899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072262899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startsForStructure(Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/levelgen/structure/Structure;)Ljava/util/List;", cancellable = true)
    private void startsForStructure__1718345971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1718345971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldGenerateStructures()Z", cancellable = true)
    private void shouldGenerateStructures__1634960846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1634960846L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "structureHasPieceAt(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/StructureStart;)Z", cancellable = true)
    private void structureHasPieceAt_1970241553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1970241553L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStructureAt(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/Structure;)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private void getStructureAt_1816033272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816033272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forWorldGenRegion(Lnet/minecraft/server/level/WorldGenRegion;)Lnet/minecraft/world/level/StructureManager;", cancellable = true)
    private void forWorldGenRegion__280589090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-280589090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAnyStructureAt(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void hasAnyStructureAt__1582229886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1582229886L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getStartForStructure(Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/levelgen/structure/Structure;Lnet/minecraft/world/level/chunk/StructureAccess;)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private void getStartForStructure__1493115118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493115118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addReferenceForStructure(Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/levelgen/structure/Structure;JLnet/minecraft/world/level/chunk/StructureAccess;)V", cancellable = true)
    private void addReferenceForStructure_1148826233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1148826233L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStartForStructure(Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/levelgen/structure/Structure;Lnet/minecraft/world/level/levelgen/structure/StructureStart;Lnet/minecraft/world/level/chunk/StructureAccess;)V", cancellable = true)
    private void setStartForStructure__859304700(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-859304700L))
            info.cancel();
    }


}
