package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.FileFixerUpper.class)
public class FileFixerUpper_1152417332Mixin {
        @Inject(at = @At("HEAD"), method = "fix(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lcom/mojang/serialization/Dynamic;Lnet/minecraft/util/worldupdate/UpgradeProgress;I)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void fix__740043433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-740043433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fix(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lcom/mojang/serialization/Dynamic;Lnet/minecraft/util/worldupdate/UpgradeProgress;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void fix_1563596592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563596592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiresFileFixing(I)Z", cancellable = true)
    private void requiresFileFixing__440297030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-440297030L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "applyFileFixers(Lnet/minecraft/util/worldupdate/UpgradeProgress;IILjava/nio/file/Path;)V", cancellable = true)
    private void applyFileFixers_1940690557(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1940690557L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "worldVersionToFileFixerVersion(I)I", cancellable = true)
    private static void worldVersionToFileFixerVersion__1172625923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172625923L))
            info.setReturnValue(-393282723);
    }

    @Inject(at = @At("HEAD"), method = "detectFileSystemCapabilities(Ljava/nio/file/Path;)Lnet/minecraft/util/filefix/FileSystemCapabilities;", cancellable = true)
    private static void detectFileSystemCapabilities_1457284154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1457284154L))
            info.setReturnValue(null);
    }


}
