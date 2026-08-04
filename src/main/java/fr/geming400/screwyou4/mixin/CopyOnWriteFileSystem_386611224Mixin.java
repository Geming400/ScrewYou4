package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.virtualfilesystem.CopyOnWriteFileSystem.class)
public class CopyOnWriteFileSystem_386611224Mixin {
        @Inject(at = @At("HEAD"), method = "store()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFileStore;", cancellable = true)
    private void store__1714080743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1714080743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOpen()Z", cancellable = true)
    private void isOpen_424889806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(424889806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "provider()Ljava/nio/file/spi/FileSystemProvider;", cancellable = true)
    private void provider__2106483717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2106483717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "provider()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSProvider;", cancellable = true)
    private void provider_351613028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(351613028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_424885962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(424885962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/PathMatcher;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFileSystem;", cancellable = true)
    private static void create__1472057886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1472057886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPath(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", cancellable = true)
    private void getPath_903649098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903649098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPath(Ljava/lang/String;[Ljava/lang/String;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void getPath_1781374917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781374917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReadOnly()Z", cancellable = true)
    private void isReadOnly_424889806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(424889806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSeparator()Ljava/lang/String;", cancellable = true)
    private void getSeparator__748849248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748849248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDirectories(Ljava/util/List;)V", cancellable = true)
    private static void createDirectories__392607117(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-392607117L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "supportedFileAttributeViews()Ljava/util/Set;", cancellable = true)
    private void supportedFileAttributeViews__1442424263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1442424263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRootDirectories()Ljava/lang/Iterable;", cancellable = true)
    private void getRootDirectories__1623138465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623138465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileStores()Ljava/lang/Iterable;", cancellable = true)
    private void getFileStores__1623138465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623138465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathMatcher(Ljava/lang/String;)Ljava/nio/file/PathMatcher;", cancellable = true)
    private void getPathMatcher_2012255683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2012255683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUserPrincipalLookupService()Ljava/nio/file/attribute/UserPrincipalLookupService;", cancellable = true)
    private void getUserPrincipalLookupService_329955087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(329955087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newWatchService()Ljava/nio/file/WatchService;", cancellable = true)
    private void newWatchService__1939904620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939904620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rootPath()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void rootPath__924553168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-924553168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseDirectory()Ljava/nio/file/Path;", cancellable = true)
    private void baseDirectory__747752459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-747752459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "collectMoveOperations(Ljava/nio/file/Path;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFileSystem$Moves;", cancellable = true)
    private void collectMoveOperations_1188118202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1188118202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveFilesWithRetry(Ljava/util/List;[Ljava/nio/file/CopyOption;)V", cancellable = true)
    private static void moveFilesWithRetry_618107222(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(618107222L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryRevertMoves(Ljava/util/List;[Ljava/nio/file/CopyOption;)Ljava/util/List;", cancellable = true)
    private static void tryRevertMoves__1366291925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1366291925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hardLinkFiles(Ljava/util/List;)V", cancellable = true)
    private static void hardLinkFiles__392607117(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-392607117L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveFiles(Ljava/util/List;)V", cancellable = true)
    private static void moveFiles__392607117(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-392607117L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tmpDirectory()Ljava/nio/file/Path;", cancellable = true)
    private void tmpDirectory__747752459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-747752459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backingFileSystem()Ljava/nio/file/FileSystem;", cancellable = true)
    private void backingFileSystem__1192673265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192673265L))
            info.setReturnValue(null);
    }


}
