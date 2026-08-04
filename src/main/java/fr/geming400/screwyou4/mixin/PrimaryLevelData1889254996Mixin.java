package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.PrimaryLevelData.class)
public class PrimaryLevelData1889254996Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/serialization/Dynamic;Lnet/minecraft/world/level/LevelSettings;Lnet/minecraft/world/level/storage/PrimaryLevelData$SpecialWorldProperty;Lcom/mojang/serialization/Lifecycle;)Lnet/minecraft/world/level/storage/PrimaryLevelData;", cancellable = true)
    private static void parse_565885688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(565885688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVersion()I", cancellable = true)
    private void getVersion_1927517242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927517242L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelName()Ljava/lang/String;", cancellable = true)
    private void getLevelName_753794525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(753794525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTag(Ljava/util/UUID;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void createTag_1639987680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1639987680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInitialized()Z", cancellable = true)
    private void isInitialized_1927533579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927533579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setInitialized(Z)V", cancellable = true)
    private void setInitialized__1176095471(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1176095471L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevelSettings()Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void getLevelSettings_2111227149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111227149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDifficultyLocked()Z", cancellable = true)
    private void isDifficultyLocked_1927533579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927533579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameType()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getGameType_493808698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(493808698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAllowCommands()Z", cancellable = true)
    private void isAllowCommands_1927533579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927533579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAllowCommands(Z)V", cancellable = true)
    private void setAllowCommands__1176095471(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1176095471L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDifficulty(Lnet/minecraft/world/Difficulty;)V", cancellable = true)
    private void setDifficulty_1482348842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1482348842L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setGameTime(J)V", cancellable = true)
    private void setGameTime__1190871807(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1190871807L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDifficultyLocked(Z)V", cancellable = true)
    private void setDifficultyLocked__1176095471(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1176095471L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSpawn(Lnet/minecraft/world/level/storage/LevelData$RespawnData;)V", cancellable = true)
    private void setSpawn__1843953902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1843953902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setGameType(Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void setGameType_2135531630(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2135531630L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDataConfiguration()Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private void getDataConfiguration__1488486388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1488486388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldGenSettingsLifecycle()Lcom/mojang/serialization/Lifecycle;", cancellable = true)
    private void worldGenSettingsLifecycle_857866566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857866566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRespawnData()Lnet/minecraft/world/level/storage/LevelData$RespawnData;", cancellable = true)
    private void getRespawnData_1298295116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298295116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillCrashReportCategory(Lnet/minecraft/CrashReportCategory;Lnet/minecraft/world/level/LevelHeightAccessor;)V", cancellable = true)
    private void fillCrashReportCategory__2083026602(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2083026602L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isHardcore()Z", cancellable = true)
    private void isHardcore_1927533579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927533579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDifficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void getDifficulty_817502326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(817502326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameTime()J", cancellable = true)
    private void getGameTime_1927518203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927518203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeVersionTag(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void writeVersionTag__498594421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-498594421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeVersionTag(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private static void writeVersionTag__1844803830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1844803830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeLastPlayed(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void writeLastPlayed__498594421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-498594421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeLastPlayed(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private static void writeLastPlayed__1844803830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1844803830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFlatWorld()Z", cancellable = true)
    private void isFlatWorld_1927533579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927533579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSinglePlayerUUID()Ljava/util/UUID;", cancellable = true)
    private void getSinglePlayerUUID__1994577817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1994577817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDebugWorld()Z", cancellable = true)
    private void isDebugWorld_1927533579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927533579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setModdedInfo(Ljava/lang/String;Z)V", cancellable = true)
    private void setModdedInfo__999155129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-999155129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "overworldData()Lnet/minecraft/world/level/storage/ServerLevelData;", cancellable = true)
    private void overworldData__378556323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-378556323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDataConfiguration(Lnet/minecraft/world/level/WorldDataConfiguration;)V", cancellable = true)
    private void setDataConfiguration_1340848000(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1340848000L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getKnownServerBrands()Ljava/util/Set;", cancellable = true)
    private void getKnownServerBrands_60219510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(60219510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRemovedFeatureFlags()Ljava/util/Set;", cancellable = true)
    private void getRemovedFeatureFlags_60219510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(60219510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wasModded()Z", cancellable = true)
    private void wasModded_1927533579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927533579L))
            info.setReturnValue(null);
    }


}
