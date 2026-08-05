package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.PrimaryLevelData.class)
public class PrimaryLevelData1889254996Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/serialization/Dynamic;Lnet/minecraft/world/level/LevelSettings;Lnet/minecraft/world/level/storage/PrimaryLevelData$SpecialWorldProperty;Lcom/mojang/serialization/Lifecycle;)Lnet/minecraft/world/level/storage/PrimaryLevelData;", cancellable = true)
    private static void parse_1963998123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963998123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVersion()I", cancellable = true)
    private void getVersion__934719272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-934719272L))
            info.setReturnValue(-239579143);
    }

    @Inject(at = @At("HEAD"), method = "getLevelName()Ljava/lang/String;", cancellable = true)
    private void getLevelName_237586070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(237586070L))
            info.setReturnValue("\u2126\u31B37my_dV\u0929,Q\u6FE3]<yft0GfJ{\"iU;M\u5DEEO\uD1CBCC8+kNN#n\uAADFP3R$iM\"X");
    }

    @Inject(at = @At("HEAD"), method = "createTag(Ljava/util/UUID;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void createTag_1578807330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578807330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInitialized()Z", cancellable = true)
    private void isInitialized_1905921793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905921793L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSinglePlayerUUID()Ljava/util/UUID;", cancellable = true)
    private void getSinglePlayerUUID__983719071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-983719071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setModdedInfo(Ljava/lang/String;Z)V", cancellable = true)
    private void setModdedInfo_573289304(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(573289304L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "overworldData()Lnet/minecraft/world/level/storage/ServerLevelData;", cancellable = true)
    private void overworldData_1079570261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1079570261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDebugWorld()Z", cancellable = true)
    private void isDebugWorld_518618082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(518618082L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setDataConfiguration(Lnet/minecraft/world/level/WorldDataConfiguration;)V", cancellable = true)
    private void setDataConfiguration__175627498(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-175627498L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAllowCommands(Z)V", cancellable = true)
    private void setAllowCommands__1495707264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1495707264L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevelSettings()Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void getLevelSettings_897513628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(897513628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldGenSettingsLifecycle()Lcom/mojang/serialization/Lifecycle;", cancellable = true)
    private void worldGenSettingsLifecycle_442569743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(442569743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDataConfiguration()Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private void getDataConfiguration_66624578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66624578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setInitialized(Z)V", cancellable = true)
    private void setInitialized_764608675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(764608675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDifficultyLocked(Z)V", cancellable = true)
    private void setDifficultyLocked_506271480(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(506271480L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillCrashReportCategory(Lnet/minecraft/CrashReportCategory;Lnet/minecraft/world/level/LevelHeightAccessor;)V", cancellable = true)
    private void fillCrashReportCategory__1257524928(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1257524928L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRespawnData()Lnet/minecraft/world/level/storage/LevelData$RespawnData;", cancellable = true)
    private void getRespawnData_1416273680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1416273680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameTime()J", cancellable = true)
    private void getGameTime_1272241606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1272241606L))
            info.setReturnValue(-8908865320480998629L);
    }

    @Inject(at = @At("HEAD"), method = "setGameType(Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void setGameType_1250114400(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1250114400L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setGameTime(J)V", cancellable = true)
    private void setGameTime__969762654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-969762654L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFlatWorld()Z", cancellable = true)
    private void isFlatWorld__1512946724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1512946724L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDifficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void getDifficulty_648315815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648315815L))
            info.setReturnValue(net.minecraft.world.Difficulty.PEACEFUL);
    }

    @Inject(at = @At("HEAD"), method = "setDifficulty(Lnet/minecraft/world/Difficulty;)V", cancellable = true)
    private void setDifficulty_1941020045(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1941020045L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDifficultyLocked()Z", cancellable = true)
    private void isDifficultyLocked__1167911556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1167911556L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isHardcore()Z", cancellable = true)
    private void isHardcore_439254583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439254583L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "wasModded()Z", cancellable = true)
    private void wasModded_37486657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(37486657L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setSpawn(Lnet/minecraft/world/level/storage/LevelData$RespawnData;)V", cancellable = true)
    private void setSpawn__960649845(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-960649845L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeLastPlayed(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void writeLastPlayed_348749779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348749779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeLastPlayed(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private static void writeLastPlayed__1071940270(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1071940270L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeVersionTag(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void writeVersionTag__965863060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-965863060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeVersionTag(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private static void writeVersionTag_887975787(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(887975787L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAllowCommands()Z", cancellable = true)
    private void isAllowCommands_1343921284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1343921284L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getGameType()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getGameType__109591044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109591044L))
            info.setReturnValue(net.minecraft.world.level.GameType.CREATIVE);
    }

    @Inject(at = @At("HEAD"), method = "getKnownServerBrands()Ljava/util/Set;", cancellable = true)
    private void getKnownServerBrands_120724954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(120724954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRemovedFeatureFlags()Ljava/util/Set;", cancellable = true)
    private void getRemovedFeatureFlags_1348368923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1348368923L))
            info.setReturnValue(null);
    }


}
