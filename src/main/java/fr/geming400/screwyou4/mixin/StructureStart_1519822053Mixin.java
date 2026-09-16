package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.StructureStart.class)
public class StructureStart_1519822053Mixin {
        @Inject(at = @At("HEAD"), method = "isValid()Z", cancellable = true)
    private void isValid__702298903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-702298903L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createTag(Lnet/minecraft/world/level/levelgen/structure/pieces/StructurePieceSerializationContext;Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void createTag_1061294584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1061294584L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getChunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void getChunkPos_22057900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(22057900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeReferenced()Z", cancellable = true)
    private void canBeReferenced_786778895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(786778895L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addReference()V", cancellable = true)
    private void addReference_1904368173(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1904368173L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox_62746943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(62746943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeInChunk(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void placeInChunk__390767396(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-390767396L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getReferences()I", cancellable = true)
    private void getReferences__1507789044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1507789044L))
            info.setReturnValue(-1269935484);
    }

    @Inject(at = @At("HEAD"), method = "getStructure()Lnet/minecraft/world/level/levelgen/structure/Structure;", cancellable = true)
    private void getStructure_1600387199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1600387199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadStaticStart(Lnet/minecraft/world/level/levelgen/structure/pieces/StructurePieceSerializationContext;Lnet/minecraft/nbt/CompoundTag;J)Lnet/minecraft/world/level/levelgen/structure/StructureStart;", cancellable = true)
    private static void loadStaticStart_1200938877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200938877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPieces()Ljava/util/List;", cancellable = true)
    private void getPieces__86172209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-86172209L))
            info.setReturnValue(null);
    }


}
