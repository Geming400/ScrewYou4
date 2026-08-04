package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelStorageSource.LevelDirectory.class)
public class LevelDirectory2067132037Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__842323000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-842323000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_931672062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(931672062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2105394779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2105394779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/nio/file/Path;", cancellable = true)
    private void path_932768355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932768355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourcePath(Lnet/minecraft/world/level/storage/LevelResource;)Ljava/nio/file/Path;", cancellable = true)
    private void resourcePath__954216018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-954216018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iconFile()Ljava/nio/file/Path;", cancellable = true)
    private void iconFile_932768355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932768355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lockFile()Ljava/nio/file/Path;", cancellable = true)
    private void lockFile_932768355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932768355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "oldDataFile()Ljava/nio/file/Path;", cancellable = true)
    private void oldDataFile_932768355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932768355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "directoryName()Ljava/lang/String;", cancellable = true)
    private void directoryName_931671566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(931671566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "corruptedDataFile(Ljava/time/ZonedDateTime;)Ljava/nio/file/Path;", cancellable = true)
    private void corruptedDataFile_1649964138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649964138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rawDataFile(Ljava/time/ZonedDateTime;)Ljava/nio/file/Path;", cancellable = true)
    private void rawDataFile_1649964138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649964138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataFile()Ljava/nio/file/Path;", cancellable = true)
    private void dataFile_932768355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932768355L))
            info.setReturnValue(null);
    }


}
