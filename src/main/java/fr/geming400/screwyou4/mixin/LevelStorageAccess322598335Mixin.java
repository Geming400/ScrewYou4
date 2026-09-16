package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelStorageSource.LevelStorageAccess.class)
public class LevelStorageAccess322598335Mixin {
        @Inject(at = @At("HEAD"), method = "parent()Lnet/minecraft/world/level/storage/LevelStorageSource;", cancellable = true)
    private void parent__1092651467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1092651467L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1791977094(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1791977094L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveDataTag(Lnet/minecraft/world/level/storage/WorldData;)V", cancellable = true)
    private void saveDataTag__49025744(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-49025744L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveDataTag(Lnet/minecraft/world/level/storage/WorldData;Ljava/util/UUID;)V", cancellable = true)
    private void saveDataTag__760296700(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-760296700L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUnfixedDataTag(Z)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void getUnfixedDataTag_1556504519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556504519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "releaseTemporarilyAndRun(Lorg/apache/commons/io/function/IORunnable;)V", cancellable = true)
    private void releaseTemporarilyAndRun__1678791050(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1678791050L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevelDirectory()Lnet/minecraft/world/level/storage/LevelStorageSource$LevelDirectory;", cancellable = true)
    private void getLevelDirectory__560629767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560629767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDimensionPath(Lnet/minecraft/resources/ResourceKey;)Ljava/nio/file/Path;", cancellable = true)
    private void getDimensionPath_2068159428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2068159428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saveLevelData(Lcom/mojang/serialization/Dynamic;)V", cancellable = true)
    private void saveLevelData__1637320897(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1637320897L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevelId()Ljava/lang/String;", cancellable = true)
    private void getLevelId_831031313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831031313L))
            info.setReturnValue("g\u2116[\uB1DEf_S,# P\u28107j8c^1LwO5u oyO%V\u3805GgLRg,zV7FM332<UPMJ{\u3E15");
    }

    @Inject(at = @At("HEAD"), method = "getLevelPath(Lnet/minecraft/world/level/storage/LevelResource;)Ljava/nio/file/Path;", cancellable = true)
    private void getLevelPath_967750453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967750453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "collectIssues(Z)V", cancellable = true)
    private void collectIssues__2055327232(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2055327232L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFileModificationTime(Z)Ljava/time/Instant;", cancellable = true)
    private void getFileModificationTime__1347242500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1347242500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "restoreLevelDataFromOld()Z", cancellable = true)
    private void restoreLevelDataFromOld__1135641095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1135641095L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "deleteLevel()V", cancellable = true)
    private void deleteLevel__1044186247(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1044186247L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasWorldData()Z", cancellable = true)
    private void hasWorldData__467040300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-467040300L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "estimateDiskSpace()J", cancellable = true)
    private void estimateDiskSpace_534128357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(534128357L))
            info.setReturnValue(420378885360689748L);
    }

    @Inject(at = @At("HEAD"), method = "renameAndDropPlayer(Ljava/lang/String;)V", cancellable = true)
    private void renameAndDropPlayer_1694354707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1694354707L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPlayerStorage()Lnet/minecraft/world/level/storage/PlayerDataStorage;", cancellable = true)
    private void createPlayerStorage_309966693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309966693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "safeClose()V", cancellable = true)
    private void safeClose__1320425241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1320425241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUnfixedDataTagWithFallback()Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void getUnfixedDataTagWithFallback_1943643951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943643951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIconFile()Ljava/util/Optional;", cancellable = true)
    private void getIconFile__411421320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-411421320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renameLevel(Ljava/lang/String;)V", cancellable = true)
    private void renameLevel__1441600810(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1441600810L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeWorldBackup()J", cancellable = true)
    private void makeWorldBackup_332582400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332582400L))
            info.setReturnValue(2259406529858939816L);
    }

    @Inject(at = @At("HEAD"), method = "fixAndGetSummary()Lnet/minecraft/world/level/storage/LevelSummary;", cancellable = true)
    private void fixAndGetSummary_1289874221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1289874221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkForLowDiskSpace()Z", cancellable = true)
    private void checkForLowDiskSpace__934500480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-934500480L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fixAndGetSummaryFromTag(Lcom/mojang/serialization/Dynamic;)Lnet/minecraft/world/level/storage/LevelSummary;", cancellable = true)
    private void fixAndGetSummaryFromTag__928192581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-928192581L))
            info.setReturnValue(null);
    }


}
