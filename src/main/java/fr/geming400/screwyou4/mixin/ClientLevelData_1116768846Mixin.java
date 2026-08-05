package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientLevel.ClientLevelData.class)
public class ClientLevelData_1116768846Mixin {
        @Inject(at = @At("HEAD"), method = "setGameTime(J)V", cancellable = true)
    private void setGameTime__1963357958(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1963357958L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGameTime()J", cancellable = true)
    private void getGameTime_1155032052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1155032052L))
            info.setReturnValue(6570944754738755596L);
    }

    @Inject(at = @At("HEAD"), method = "getRespawnData()Lnet/minecraft/world/level/storage/LevelData$RespawnData;", cancellable = true)
    private void getRespawnData_525808965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525808965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillCrashReportCategory(Lnet/minecraft/CrashReportCategory;Lnet/minecraft/world/level/LevelHeightAccessor;)V", cancellable = true)
    private void fillCrashReportCategory_1439454543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1439454543L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDifficultyLocked()Z", cancellable = true)
    private void isDifficultyLocked_1155047428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1155047428L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setDifficulty(Lnet/minecraft/world/Difficulty;)V", cancellable = true)
    private void setDifficulty_709862691(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(709862691L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDifficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void getDifficulty_45016175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(45016175L))
            info.setReturnValue(net.minecraft.world.Difficulty.NORMAL);
    }

    @Inject(at = @At("HEAD"), method = "isHardcore()Z", cancellable = true)
    private void isHardcore_1155047428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1155047428L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setSpawn(Lnet/minecraft/world/level/storage/LevelData$RespawnData;)V", cancellable = true)
    private void setSpawn_1678527243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1678527243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "voidDarknessOnsetRange()F", cancellable = true)
    private void voidDarknessOnsetRange_1155028208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1155028208L))
            info.setReturnValue(9.158599E8F);
    }

    @Inject(at = @At("HEAD"), method = "setDifficultyLocked(Z)V", cancellable = true)
    private void setDifficultyLocked__1948581622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1948581622L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHorizonHeight(Lnet/minecraft/world/level/LevelHeightAccessor;)D", cancellable = true)
    private void getHorizonHeight_1441241711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441241711L))
            info.setReturnValue(9.158599005525296E8D);
    }


}
