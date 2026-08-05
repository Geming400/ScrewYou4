package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelStorageSource.class)
public class LevelStorageSource1763560954Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_628100483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628100483L))
            info.setReturnValue("mv_:=%W\u87EF+T8Wm");
    }

    @Inject(at = @At("HEAD"), method = "getWorldDirValidator()Lnet/minecraft/world/level/validation/DirectoryValidator;", cancellable = true)
    private void getWorldDirValidator_1138548991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1138548991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseValidator(Ljava/nio/file/Path;)Lnet/minecraft/world/level/validation/DirectoryValidator;", cancellable = true)
    private static void parseValidator_911372886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(911372886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeWorldGenSettings(Lnet/minecraft/core/RegistryAccess;Ljava/nio/file/Path;Lnet/minecraft/world/level/levelgen/WorldGenSettings;)V", cancellable = true)
    private static void writeWorldGenSettings_401571451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(401571451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeGameRules(Lnet/minecraft/world/level/storage/WorldData;Ljava/nio/file/Path;Lnet/minecraft/world/level/gamerules/GameRules;)V", cancellable = true)
    private static void writeGameRules__646194349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-646194349L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isNewLevelIdAcceptable(Ljava/lang/String;)Z", cancellable = true)
    private void isNewLevelIdAcceptable__1379041349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379041349L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "readDataConfig(Lcom/mojang/serialization/Dynamic;)Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private static void readDataConfig__1960234964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1960234964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDefault(Ljava/nio/file/Path;)Lnet/minecraft/world/level/storage/LevelStorageSource;", cancellable = true)
    private static void createDefault_532165439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532165439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelPath(Ljava/lang/String;)Ljava/nio/file/Path;", cancellable = true)
    private void getLevelPath__1901195890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1901195890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseDir()Ljava/nio/file/Path;", cancellable = true)
    private void getBaseDir_629197272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629197272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBackupPath()Ljava/nio/file/Path;", cancellable = true)
    private void getBackupPath_629197272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629197272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateAndCreateAccess(Ljava/lang/String;)Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;", cancellable = true)
    private void validateAndCreateAccess_1661981323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661981323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPackConfig(Lcom/mojang/serialization/Dynamic;Lnet/minecraft/server/packs/repository/PackRepository;Z)Lnet/minecraft/server/WorldLoader$PackConfig;", cancellable = true)
    private static void getPackConfig_434053980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(434053980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findLevelCandidates()Lnet/minecraft/world/level/storage/LevelStorageSource$LevelCandidates;", cancellable = true)
    private void findLevelCandidates__102821610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-102821610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadLevelSummaries(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelCandidates;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void loadLevelSummaries__341670374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-341670374L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "readExistingSavedData(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/world/level/saveddata/SavedDataType;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void readExistingSavedData_749597489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(749597489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelDataAndDimensions(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lcom/mojang/serialization/Dynamic;Lnet/minecraft/world/level/WorldDataConfiguration;Lnet/minecraft/core/Registry;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/level/storage/LevelDataAndDimensions;", cancellable = true)
    private static void getLevelDataAndDimensions_1633197905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633197905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAccess(Ljava/lang/String;)Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;", cancellable = true)
    private void createAccess_1661981323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661981323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levelExists(Ljava/lang/String;)Z", cancellable = true)
    private void levelExists__1379041349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379041349L))
            info.setReturnValue(false);
    }


}
