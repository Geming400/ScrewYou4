package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelSummary.class)
public class LevelSummary1275667562Mixin {
        @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__1633675348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1633675348L))
            info.setReturnValue(-1342288790);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/world/level/storage/LevelSummary;)I", cancellable = true)
    private void compareTo_1620079533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620079533L))
            info.setReturnValue(-530635490);
    }

    @Inject(at = @At("HEAD"), method = "isLocked()Z", cancellable = true)
    private void isLocked_1313946145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313946145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getInfo()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getInfo__901241603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-901241603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelName()Ljava/lang/String;", cancellable = true)
    private void getLevelName_140207091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140207091L))
            info.setReturnValue("Lcﲂ<8ugd%uiji2<@Gf ]jZ=5-*=-ሚZ");
    }

    @Inject(at = @At("HEAD"), method = "isCompatible()Z", cancellable = true)
    private void isCompatible_1313946145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313946145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isDisabled()Z", cancellable = true)
    private void isDisabled_1313946145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313946145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getIcon()Ljava/nio/file/Path;", cancellable = true)
    private void getIcon_141303880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141303880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiresFileFixing()Z", cancellable = true)
    private void requiresFileFixing_1313946145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313946145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSettings()Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void getSettings_1497639715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497639715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canDelete()Z", cancellable = true)
    private void canDelete_1313946145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313946145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canEdit()Z", cancellable = true)
    private void canEdit_1313946145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313946145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canUpload()Z", cancellable = true)
    private void canUpload_1313946145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313946145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getGameMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getGameMode__119778736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-119778736L))
            info.setReturnValue(net.minecraft.world.level.GameType.ADVENTURE);
    }

    @Inject(at = @At("HEAD"), method = "hasCommands()Z", cancellable = true)
    private void hasCommands_1313946145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313946145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "levelVersion()Lnet/minecraft/world/level/storage/LevelVersion;", cancellable = true)
    private void levelVersion_1004387796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004387796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelId()Ljava/lang/String;", cancellable = true)
    private void getLevelId_140207091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140207091L))
            info.setReturnValue("Lcﲂ<8ugd%uiji2<@Gf ]jZ=5-*=-ሚZ");
    }

    @Inject(at = @At("HEAD"), method = "primaryActionActive()Z", cancellable = true)
    private void primaryActionActive_1313946145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313946145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "primaryActionMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void primaryActionMessage__901241603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-901241603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canRecreate()Z", cancellable = true)
    private void canRecreate_1313946145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313946145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "backupStatus()Lnet/minecraft/world/level/storage/LevelSummary$BackupStatus;", cancellable = true)
    private void backupStatus_710115272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(710115272L))
            info.setReturnValue(net.minecraft.world.level.storage.LevelSummary.BackupStatus.NONE);
    }

    @Inject(at = @At("HEAD"), method = "shouldBackup()Z", cancellable = true)
    private void shouldBackup_1313946145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313946145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getWorldVersionName()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void getWorldVersionName__1132336651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1132336651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastPlayed()J", cancellable = true)
    private void getLastPlayed_1313930769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313930769L))
            info.setReturnValue(537538476766345040L);
    }

    @Inject(at = @At("HEAD"), method = "isDowngrade()Z", cancellable = true)
    private void isDowngrade_1313946145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313946145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "requiresManualConversion()Z", cancellable = true)
    private void requiresManualConversion_1313946145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313946145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isExperimental()Z", cancellable = true)
    private void isExperimental_1313946145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313946145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isHardcore()Z", cancellable = true)
    private void isHardcore_1313946145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313946145L))
            info.setReturnValue(false);
    }


}
