package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.DerivedLevelData.class)
public class DerivedLevelData1892656985Mixin {
        @Inject(at = @At("HEAD"), method = "getLevelName()Ljava/lang/String;", cancellable = true)
    private void getLevelName_240988059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240988059L))
            info.setReturnValue("#r'\u85D0\uACDEd9sW\u2DCD-N(s|@<'r6\"qY%\u96FFP$\u693E\u0D69l?Si\u4D5F*-5j'\u0706zgv\u802E\"<Q8hy");
    }

    @Inject(at = @At("HEAD"), method = "isInitialized()Z", cancellable = true)
    private void isInitialized_1909323782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909323782L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setAllowCommands(Z)V", cancellable = true)
    private void setAllowCommands__1492305275(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1492305275L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setInitialized(Z)V", cancellable = true)
    private void setInitialized_768010664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(768010664L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillCrashReportCategory(Lnet/minecraft/CrashReportCategory;Lnet/minecraft/world/level/LevelHeightAccessor;)V", cancellable = true)
    private void fillCrashReportCategory__1254122939(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1254122939L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRespawnData()Lnet/minecraft/world/level/storage/LevelData$RespawnData;", cancellable = true)
    private void getRespawnData_1419675669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1419675669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameTime()J", cancellable = true)
    private void getGameTime_1275643595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1275643595L))
            info.setReturnValue(-1858705168563335355L);
    }

    @Inject(at = @At("HEAD"), method = "setGameType(Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void setGameType_1253516389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1253516389L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setGameTime(J)V", cancellable = true)
    private void setGameTime__966360665(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-966360665L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDifficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void getDifficulty_651717804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(651717804L))
            info.setReturnValue(net.minecraft.world.Difficulty.EASY);
    }

    @Inject(at = @At("HEAD"), method = "isDifficultyLocked()Z", cancellable = true)
    private void isDifficultyLocked__1164509567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1164509567L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isHardcore()Z", cancellable = true)
    private void isHardcore_442656572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(442656572L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setSpawn(Lnet/minecraft/world/level/storage/LevelData$RespawnData;)V", cancellable = true)
    private void setSpawn__957247856(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-957247856L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAllowCommands()Z", cancellable = true)
    private void isAllowCommands_1347323273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347323273L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getGameType()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getGameType__106189055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-106189055L))
            info.setReturnValue(net.minecraft.world.level.GameType.SURVIVAL);
    }


}
