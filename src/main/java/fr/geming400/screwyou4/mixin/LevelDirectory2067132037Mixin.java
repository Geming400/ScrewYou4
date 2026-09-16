package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelStorageSource.LevelDirectory.class)
public class LevelDirectory2067132037Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1158505769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1158505769L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1457411734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457411734L))
            info.setReturnValue("gp\"C,P?QS\u4749RG\u1715okH@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1670483168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1670483168L))
            info.setReturnValue(1333802244);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/nio/file/Path;", cancellable = true)
    private void path__723751032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-723751032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourcePath(Lnet/minecraft/world/level/storage/LevelResource;)Ljava/nio/file/Path;", cancellable = true)
    private void resourcePath_369447355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(369447355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lockFile()Ljava/nio/file/Path;", cancellable = true)
    private void lockFile__1909266774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1909266774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataFile()Ljava/nio/file/Path;", cancellable = true)
    private void dataFile__1773245271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1773245271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "directoryName()Ljava/lang/String;", cancellable = true)
    private void directoryName_375569062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(375569062L))
            info.setReturnValue("S>SBD\u03DD#7\u523D%\u66A8-\uC7781BQ:H= \u88D0ZrwX!*");
    }

    @Inject(at = @At("HEAD"), method = "oldDataFile()Ljava/nio/file/Path;", cancellable = true)
    private void oldDataFile_435012336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(435012336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "corruptedDataFile(Ljava/time/ZonedDateTime;)Ljava/nio/file/Path;", cancellable = true)
    private void corruptedDataFile__369734952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-369734952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rawDataFile(Ljava/time/ZonedDateTime;)Ljava/nio/file/Path;", cancellable = true)
    private void rawDataFile_959295900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(959295900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iconFile()Ljava/nio/file/Path;", cancellable = true)
    private void iconFile_2126544120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126544120L))
            info.setReturnValue(null);
    }


}
