package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelSummary.class)
public class LevelSummary1275667562Mixin {
        @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__616436372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-616436372L))
            info.setReturnValue(874923428);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/world/level/storage/LevelSummary;)I", cancellable = true)
    private void compareTo__358237843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-358237843L))
            info.setReturnValue(-1962270017);
    }

    @Inject(at = @At("HEAD"), method = "isLocked()Z", cancellable = true)
    private void isLocked_27785677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(27785677L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getInfo()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getInfo_145507617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(145507617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelName()Ljava/lang/String;", cancellable = true)
    private void getLevelName__376001364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-376001364L))
            info.setReturnValue("\uA7D6Gqk\uA2B4-Ho(Tsm \u7310\uA0696!\uC6D6^,uBLQIr-ci9(D\u90F6YDj8&w-'H>p/$x`");
    }

    @Inject(at = @At("HEAD"), method = "isCompatible()Z", cancellable = true)
    private void isCompatible__984910525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-984910525L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "requiresFileFixing()Z", cancellable = true)
    private void requiresFileFixing_807767530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807767530L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getGameMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getGameMode_857831803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857831803L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "getLevelId()Ljava/lang/String;", cancellable = true)
    private void getLevelId_1784100540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1784100540L))
            info.setReturnValue("wQYU>8Ky9{+7;#h'\u6206]Ldn5KF@yg PEkf:7v[\u4FF0q[6?__eaJc`'=[].U9TOS\u581DVbq NKky");
    }

    @Inject(at = @At("HEAD"), method = "isExperimental()Z", cancellable = true)
    private void isExperimental__1930749393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930749393L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isHardcore()Z", cancellable = true)
    private void isHardcore__174332851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-174332851L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getIcon()Ljava/nio/file/Path;", cancellable = true)
    private void getIcon__564615113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-564615113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDisabled()Z", cancellable = true)
    private void isDisabled__1277721573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1277721573L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLastPlayed()J", cancellable = true)
    private void getLastPlayed__1192117134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192117134L))
            info.setReturnValue(5705163572304384901L);
    }

    @Inject(at = @At("HEAD"), method = "requiresManualConversion()Z", cancellable = true)
    private void requiresManualConversion_1645353751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1645353751L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isDowngrade()Z", cancellable = true)
    private void isDowngrade_719884950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(719884950L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "primaryActionMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void primaryActionMessage__1311479732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1311479732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "primaryActionActive()Z", cancellable = true)
    private void primaryActionActive_1352085731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1352085731L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canRecreate()Z", cancellable = true)
    private void canRecreate__279192414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-279192414L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "backupStatus()Lnet/minecraft/world/level/storage/LevelSummary$BackupStatus;", cancellable = true)
    private void backupStatus_1748423156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1748423156L))
            info.setReturnValue(net.minecraft.world.level.storage.LevelSummary.BackupStatus.NONE);
    }

    @Inject(at = @At("HEAD"), method = "shouldBackup()Z", cancellable = true)
    private void shouldBackup__1614536212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1614536212L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getWorldVersionName()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void getWorldVersionName__271339314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-271339314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canDelete()Z", cancellable = true)
    private void canDelete_1881910630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881910630L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canEdit()Z", cancellable = true)
    private void canEdit__1392350105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1392350105L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canUpload()Z", cancellable = true)
    private void canUpload__226235696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-226235696L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "levelVersion()Lnet/minecraft/world/level/storage/LevelVersion;", cancellable = true)
    private void levelVersion__2048956280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2048956280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasCommands()Z", cancellable = true)
    private void hasCommands__567628769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567628769L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSettings()Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void getSettings_781940266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(781940266L))
            info.setReturnValue(null);
    }


}
