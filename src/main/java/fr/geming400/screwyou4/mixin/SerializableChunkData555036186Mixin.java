package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.SerializableChunkData.class)
public class SerializableChunkData555036186Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1940548445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1940548445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__580423789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-580423789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_593298928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593298928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyOf(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/chunk/ChunkAccess;)Lnet/minecraft/world/level/chunk/storage/SerializableChunkData;", cancellable = true)
    private static void copyOf_555139331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(555139331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void write__1015186734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1015186734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/chunk/PalettedContainerFactory;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/level/chunk/storage/SerializableChunkData;", cancellable = true)
    private static void parse_83298587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(83298587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/ai/village/poi/PoiManager;Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/world/level/chunk/ProtoChunk;", cancellable = true)
    private void read__1030733714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1030733714L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunkPos__334062651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-334062651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entities()Ljava/util/List;", cancellable = true)
    private void entities__2113594294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113594294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blendingData()Lnet/minecraft/world/level/levelgen/blending/BlendingData$Packed;", cancellable = true)
    private void blendingData_1156790868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1156790868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containerFactory()Lnet/minecraft/world/level/chunk/PalettedContainerFactory;", cancellable = true)
    private void containerFactory__1495283080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1495283080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inhabitedTime()J", cancellable = true)
    private void inhabitedTime_593299393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593299393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockEntities()Ljava/util/List;", cancellable = true)
    private void blockEntities__2113594294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113594294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heightmaps()Ljava/util/Map;", cancellable = true)
    private void heightmaps__1449587454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1449587454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minSectionY()I", cancellable = true)
    private void minSectionY_593298432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593298432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastUpdateTime()J", cancellable = true)
    private void lastUpdateTime_593299393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593299393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkStatusFromTag(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private static void getChunkStatusFromTag__773383531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773383531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "belowZeroRetrogen()Lnet/minecraft/world/level/levelgen/BelowZeroRetrogen;", cancellable = true)
    private void belowZeroRetrogen_294746436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(294746436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgradeData()Lnet/minecraft/world/level/chunk/UpgradeData;", cancellable = true)
    private void upgradeData__1997825866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1997825866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureData()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void structureData__1015186734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1015186734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "carvingMask()[J", cancellable = true)
    private void carvingMask_1740878504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1740878504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionData()Ljava/util/List;", cancellable = true)
    private void sectionData__2113594294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113594294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packedTicks()Lnet/minecraft/world/level/chunk/ChunkAccess$PackedTicks;", cancellable = true)
    private void packedTicks__1028782543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028782543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postProcessingSections()[Lit/unimi/dsi/fastutil/shorts/ShortList;", cancellable = true)
    private void postProcessingSections__1934834166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1934834166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkStatus()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void chunkStatus_572315784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572315784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightCorrect()Z", cancellable = true)
    private void lightCorrect_593314769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593314769L))
            info.setReturnValue(null);
    }


}
