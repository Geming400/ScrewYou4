package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.SerializableChunkData.class)
public class SerializableChunkData555036186Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__353590082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-353590082L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1325459711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325459711L))
            info.setReturnValue("T\u401D5U(X:\u3AD9w-3,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1112388277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1112388277L))
            info.setReturnValue(52815511);
    }

    @Inject(at = @At("HEAD"), method = "copyOf(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/chunk/ChunkAccess;)Lnet/minecraft/world/level/chunk/storage/SerializableChunkData;", cancellable = true)
    private static void copyOf_1470491951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470491951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void write_1958076051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958076051L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/chunk/PalettedContainerFactory;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/level/chunk/storage/SerializableChunkData;", cancellable = true)
    private static void parse__1144285048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1144285048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/ai/village/poi/PoiManager;Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/world/level/chunk/ProtoChunk;", cancellable = true)
    private void read__615411048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615411048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunkPos__1310585492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1310585492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkStatusFromTag(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private static void getChunkStatusFromTag__925135122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-925135122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entities()Ljava/util/List;", cancellable = true)
    private void entities__1910441589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1910441589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockEntities()Ljava/util/List;", cancellable = true)
    private void blockEntities__1391809352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1391809352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureData()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void structureData_312089077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(312089077L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "minSectionY()I", cancellable = true)
    private void minSectionY__410111686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-410111686L))
            info.setReturnValue(-1590956211);
    }

    @Inject(at = @At("HEAD"), method = "carvingMask()[J", cancellable = true)
    private void carvingMask__1440250316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1440250316L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postProcessingSections()[Lit/unimi/dsi/fastutil/shorts/ShortList;", cancellable = true)
    private void postProcessingSections__302232439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302232439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightCorrect()Z", cancellable = true)
    private void lightCorrect_1162012125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1162012125L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sectionData()Ljava/util/List;", cancellable = true)
    private void sectionData_659691257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659691257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkStatus()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void chunkStatus__1784403897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1784403897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packedTicks()Lnet/minecraft/world/level/chunk/ChunkAccess$PackedTicks;", cancellable = true)
    private void packedTicks_1097802259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097802259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containerFactory()Lnet/minecraft/world/level/chunk/PalettedContainerFactory;", cancellable = true)
    private void containerFactory__1927063039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1927063039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inhabitedTime()J", cancellable = true)
    private void inhabitedTime__2116774810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2116774810L))
            info.setReturnValue(-1995959252796566667L);
    }

    @Inject(at = @At("HEAD"), method = "upgradeData()Lnet/minecraft/world/level/chunk/UpgradeData;", cancellable = true)
    private void upgradeData__35903088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-35903088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blendingData()Lnet/minecraft/world/level/levelgen/blending/BlendingData$Packed;", cancellable = true)
    private void blendingData_1720111609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1720111609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "belowZeroRetrogen()Lnet/minecraft/world/level/levelgen/BelowZeroRetrogen;", cancellable = true)
    private void belowZeroRetrogen__1021395185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1021395185L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heightmaps()Ljava/util/Map;", cancellable = true)
    private void heightmaps__1175270396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1175270396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastUpdateTime()J", cancellable = true)
    private void lastUpdateTime__568849195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-568849195L))
            info.setReturnValue(8447174865860537177L);
    }


}
