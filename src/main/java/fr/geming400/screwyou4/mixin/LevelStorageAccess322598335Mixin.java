package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelStorageSource.LevelStorageAccess.class)
public class LevelStorageAccess322598335Mixin {
        @Inject(at = @At("HEAD"), method = "parent()Lnet/minecraft/world/level/storage/LevelStorageSource;", cancellable = true)
    private void parent_1859417611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1859417611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_360873074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(360873074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIconFile()Ljava/util/Optional;", cancellable = true)
    private void getIconFile_568059757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568059757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixAndGetSummary()Lnet/minecraft/world/level/storage/LevelSummary;", cancellable = true)
    private void fixAndGetSummary_406251931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406251931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeWorldBackup()J", cancellable = true)
    private void makeWorldBackup_360861542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360861542L))
            info.setReturnValue(364626787809017223L);
    }

    @Inject(at = @At("HEAD"), method = "renameLevel(Ljava/lang/String;)V", cancellable = true)
    private void renameLevel_1474959484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1474959484L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fixAndGetSummaryFromTag(Lcom/mojang/serialization/Dynamic;)Lnet/minecraft/world/level/storage/LevelSummary;", cancellable = true)
    private void fixAndGetSummaryFromTag_110920093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(110920093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkForLowDiskSpace()Z", cancellable = true)
    private void checkForLowDiskSpace_360876918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360876918L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getLevelPath(Lnet/minecraft/world/level/storage/LevelResource;)Ljava/nio/file/Path;", cancellable = true)
    private void getLevelPath_1596217576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596217576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelId()Ljava/lang/String;", cancellable = true)
    private void getLevelId__812862136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-812862136L))
            info.setReturnValue("5*Kxꙷs/AyfBLeꆤy8i4`쭫T b!v쳾kRlY'");
    }

    @Inject(at = @At("HEAD"), method = "getDimensionPath(Lnet/minecraft/resources/ResourceKey;)Ljava/nio/file/Path;", cancellable = true)
    private void getDimensionPath_918021785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(918021785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saveLevelData(Lcom/mojang/serialization/Dynamic;)V", cancellable = true)
    private void saveLevelData__1885038416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1885038416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevelDirectory()Lnet/minecraft/world/level/storage/LevelStorageSource$LevelDirectory;", cancellable = true)
    private void getLevelDirectory_1696910680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1696910680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUnfixedDataTag(Z)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void getUnfixedDataTag__705881678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705881678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "releaseTemporarilyAndRun(Lorg/apache/commons/io/function/IORunnable;)V", cancellable = true)
    private void releaseTemporarilyAndRun__1005995173(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1005995173L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPlayerStorage()Lnet/minecraft/world/level/storage/PlayerDataStorage;", cancellable = true)
    private void createPlayerStorage_2131560035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131560035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "estimateDiskSpace()J", cancellable = true)
    private void estimateDiskSpace_360861542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360861542L))
            info.setReturnValue(364626787809017223L);
    }

    @Inject(at = @At("HEAD"), method = "renameAndDropPlayer(Ljava/lang/String;)V", cancellable = true)
    private void renameAndDropPlayer_1474959484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1474959484L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "safeClose()V", cancellable = true)
    private void safeClose_360873074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(360873074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveDataTag(Lnet/minecraft/world/level/storage/WorldData;Ljava/util/UUID;)V", cancellable = true)
    private void saveDataTag__1867019151(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1867019151L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveDataTag(Lnet/minecraft/world/level/storage/WorldData;)V", cancellable = true)
    private void saveDataTag__1298192227(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1298192227L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "collectIssues(Z)V", cancellable = true)
    private void collectIssues_1552215164(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1552215164L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "restoreLevelDataFromOld()Z", cancellable = true)
    private void restoreLevelDataFromOld_360876918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360876918L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFileModificationTime(Z)Ljava/time/Instant;", cancellable = true)
    private void getFileModificationTime_848244321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(848244321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deleteLevel()V", cancellable = true)
    private void deleteLevel_360873074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(360873074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasWorldData()Z", cancellable = true)
    private void hasWorldData_360876918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360876918L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getUnfixedDataTagWithFallback()Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void getUnfixedDataTagWithFallback_1805901948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1805901948L))
            info.setReturnValue(null);
    }


}
