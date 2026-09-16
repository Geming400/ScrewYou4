package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientLevel.ClientLevelData.class)
public class ClientLevelData_1116768846Mixin {
        @Inject(at = @At("HEAD"), method = "setDifficultyLocked(Z)V", cancellable = true)
    private void setDifficultyLocked__266214671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-266214671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHorizonHeight(Lnet/minecraft/world/level/LevelHeightAccessor;)D", cancellable = true)
    private void getHorizonHeight__631726245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-631726245L))
            info.setReturnValue(4.999977008250842E8D);
    }

    @Inject(at = @At("HEAD"), method = "voidDarknessOnsetRange()F", cancellable = true)
    private void voidDarknessOnsetRange_819390869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(819390869L))
            info.setReturnValue(4.999977E8F);
    }

    @Inject(at = @At("HEAD"), method = "setSpawn(Lnet/minecraft/world/level/storage/LevelData$RespawnData;)V", cancellable = true)
    private void setSpawn__1733135996(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1733135996L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGameTime()J", cancellable = true)
    private void getGameTime_499755455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(499755455L))
            info.setReturnValue(35833295013414493L);
    }

    @Inject(at = @At("HEAD"), method = "getDifficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void getDifficulty__124170336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-124170336L))
            info.setReturnValue(net.minecraft.world.Difficulty.NORMAL);
    }

    @Inject(at = @At("HEAD"), method = "getRespawnData()Lnet/minecraft/world/level/storage/LevelData$RespawnData;", cancellable = true)
    private void getRespawnData_643787529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(643787529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillCrashReportCategory(Lnet/minecraft/CrashReportCategory;Lnet/minecraft/world/level/LevelHeightAccessor;)V", cancellable = true)
    private void fillCrashReportCategory__2030011079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2030011079L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDifficultyLocked()Z", cancellable = true)
    private void isDifficultyLocked__1940397707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940397707L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setGameTime(J)V", cancellable = true)
    private void setGameTime__1742248805(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1742248805L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDifficulty(Lnet/minecraft/world/Difficulty;)V", cancellable = true)
    private void setDifficulty_1168533894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1168533894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isHardcore()Z", cancellable = true)
    private void isHardcore__333231568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-333231568L))
            info.setReturnValue(false);
    }


}
