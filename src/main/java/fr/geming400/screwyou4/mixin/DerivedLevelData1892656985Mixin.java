package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.DerivedLevelData.class)
public class DerivedLevelData1892656985Mixin {
        @Inject(at = @At("HEAD"), method = "getLevelName()Ljava/lang/String;", cancellable = true)
    private void getLevelName_757196514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757196514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInitialized()Z", cancellable = true)
    private void isInitialized_1930935568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1930935568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setInitialized(Z)V", cancellable = true)
    private void setInitialized__1172693482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1172693482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDifficultyLocked()Z", cancellable = true)
    private void isDifficultyLocked_1930935568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1930935568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameType()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getGameType_497210687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(497210687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAllowCommands()Z", cancellable = true)
    private void isAllowCommands_1930935568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1930935568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAllowCommands(Z)V", cancellable = true)
    private void setAllowCommands__1172693482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1172693482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setGameTime(J)V", cancellable = true)
    private void setGameTime__1187469818(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1187469818L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSpawn(Lnet/minecraft/world/level/storage/LevelData$RespawnData;)V", cancellable = true)
    private void setSpawn__1840551913(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1840551913L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setGameType(Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void setGameType_2138933619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2138933619L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRespawnData()Lnet/minecraft/world/level/storage/LevelData$RespawnData;", cancellable = true)
    private void getRespawnData_1301697105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301697105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillCrashReportCategory(Lnet/minecraft/CrashReportCategory;Lnet/minecraft/world/level/LevelHeightAccessor;)V", cancellable = true)
    private void fillCrashReportCategory__2079624613(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2079624613L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isHardcore()Z", cancellable = true)
    private void isHardcore_1930935568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1930935568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDifficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void getDifficulty_820904315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(820904315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameTime()J", cancellable = true)
    private void getGameTime_1930920192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1930920192L))
            info.setReturnValue(null);
    }


}
