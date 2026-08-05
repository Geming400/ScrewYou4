package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.FileFixerUpper.class)
public class FileFixerUpper_1152417332Mixin {
        @Inject(at = @At("HEAD"), method = "fix(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lcom/mojang/serialization/Dynamic;Lnet/minecraft/util/worldupdate/UpgradeProgress;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void fix_2012227749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2012227749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fix(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lcom/mojang/serialization/Dynamic;Lnet/minecraft/util/worldupdate/UpgradeProgress;I)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void fix_282620546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(282620546L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiresFileFixing(I)Z", cancellable = true)
    private void requiresFileFixing__1928629149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1928629149L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "applyFileFixers(Lnet/minecraft/util/worldupdate/UpgradeProgress;IILjava/nio/file/Path;)V", cancellable = true)
    private void applyFileFixers_641986872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(641986872L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "detectFileSystemCapabilities(Ljava/nio/file/Path;)Lnet/minecraft/util/filefix/FileSystemCapabilities;", cancellable = true)
    private static void detectFileSystemCapabilities__1004205218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1004205218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldVersionToFileFixerVersion(I)I", cancellable = true)
    private static void worldVersionToFileFixerVersion__1928645238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1928645238L))
            info.setReturnValue(-1598546302);
    }


}
