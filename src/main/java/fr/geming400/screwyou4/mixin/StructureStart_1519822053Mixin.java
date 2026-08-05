package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.StructureStart.class)
public class StructureStart_1519822053Mixin {
        @Inject(at = @At("HEAD"), method = "isValid()Z", cancellable = true)
    private void isValid_1558100635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558100635L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createTag(Lnet/minecraft/world/level/levelgen/structure/pieces/StructurePieceSerializationContext;Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void createTag_164202166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(164202166L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getStructure()Lnet/minecraft/world/level/levelgen/structure/Structure;", cancellable = true)
    private void getStructure__797779134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-797779134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox_1689969838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1689969838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeReferenced()Z", cancellable = true)
    private void canBeReferenced_1558100635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558100635L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getChunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void getChunkPos_630723215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(630723215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addReference()V", cancellable = true)
    private void addReference_1558096791(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1558096791L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getReferences()I", cancellable = true)
    private void getReferences_1558084298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558084298L))
            info.setReturnValue(-40133902);
    }

    @Inject(at = @At("HEAD"), method = "placeInChunk(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void placeInChunk__336506627(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-336506627L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPieces()Ljava/util/List;", cancellable = true)
    private void getPieces__1148808428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148808428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadStaticStart(Lnet/minecraft/world/level/levelgen/structure/pieces/StructurePieceSerializationContext;Lnet/minecraft/nbt/CompoundTag;J)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private static void loadStaticStart__1567943285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1567943285L))
            info.setReturnValue(null);
    }


}
