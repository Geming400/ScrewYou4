package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelStorageSource.class)
public class LevelStorageSource1763560954Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__125285948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-125285948L))
            info.setReturnValue("h]\uBC37w4(@*u9V.hk[CEH$+QV\u28DEb5bHE\u64A4=t>qucV\uC3C2*XrVy\u4198Z9><2c?|\u8B2E*\u52E9\u165B>\uA219!?");
    }

    @Inject(at = @At("HEAD"), method = "createAccess(Ljava/lang/String;)Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;", cancellable = true)
    private void createAccess_1441565963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441565963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBackupPath()Ljava/nio/file/Path;", cancellable = true)
    private void getBackupPath_1125332949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1125332949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPackConfig(Lcom/mojang/serialization/Dynamic;Lnet/minecraft/server/packs/repository/PackRepository;Z)Lnet/minecraft/server/WorldLoader$PackConfig;", cancellable = true)
    private static void getPackConfig__69468979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-69468979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateAndCreateAccess(Ljava/lang/String;)Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;", cancellable = true)
    private void validateAndCreateAccess_1551405418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1551405418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelDataAndDimensions(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lcom/mojang/serialization/Dynamic;Lnet/minecraft/world/level/WorldDataConfiguration;Lnet/minecraft/core/Registry;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/level/storage/LevelDataAndDimensions;", cancellable = true)
    private static void getLevelDataAndDimensions__1211573859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211573859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readExistingSavedData(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/world/level/saveddata/SavedDataType;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void readExistingSavedData_2077314721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077314721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadLevelSummaries(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelCandidates;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void loadLevelSummaries__1404590400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1404590400L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "findLevelCandidates()Lnet/minecraft/world/level/storage/LevelStorageSource$LevelCandidates;", cancellable = true)
    private void findLevelCandidates_634778193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(634778193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseValidator(Ljava/nio/file/Path;)Lnet/minecraft/world/level/validation/DirectoryValidator;", cancellable = true)
    private static void parseValidator_2012846679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2012846679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelPath(Ljava/lang/String;)Ljava/nio/file/Path;", cancellable = true)
    private void getLevelPath_455674081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(455674081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readDataConfig(Lcom/mojang/serialization/Dynamic;)Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private static void readDataConfig_252552174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(252552174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDefault(Ljava/nio/file/Path;)Lnet/minecraft/world/level/storage/LevelStorageSource;", cancellable = true)
    private static void createDefault__1784856540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1784856540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseDir()Ljava/nio/file/Path;", cancellable = true)
    private void getBaseDir_691854238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(691854238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWorldDirValidator()Lnet/minecraft/world/level/validation/DirectoryValidator;", cancellable = true)
    private void getWorldDirValidator__980535458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980535458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levelExists(Ljava/lang/String;)Z", cancellable = true)
    private void levelExists__499607877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499607877L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "writeGameRules(Lnet/minecraft/world/level/storage/WorldData;Ljava/nio/file/Path;Lnet/minecraft/world/level/gamerules/GameRules;)V", cancellable = true)
    private static void writeGameRules__508593139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-508593139L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeWorldGenSettings(Lnet/minecraft/core/RegistryAccess;Ljava/nio/file/Path;Lnet/minecraft/world/level/levelgen/WorldGenSettings;)V", cancellable = true)
    private static void writeWorldGenSettings__1861863461(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1861863461L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isNewLevelIdAcceptable(Ljava/lang/String;)Z", cancellable = true)
    private void isNewLevelIdAcceptable__1680081584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1680081584L))
            info.setReturnValue(true);
    }


}
