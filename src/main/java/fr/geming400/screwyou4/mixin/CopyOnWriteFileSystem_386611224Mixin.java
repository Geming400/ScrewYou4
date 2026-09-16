package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.virtualfilesystem.CopyOnWriteFileSystem.class)
public class CopyOnWriteFileSystem_386611224Mixin {
        @Inject(at = @At("HEAD"), method = "store()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFileStore;", cancellable = true)
    private void store_921449496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921449496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOpen()Z", cancellable = true)
    private void isOpen__1236613190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1236613190L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "provider()Ljava/nio/file/spi/FileSystemProvider;", cancellable = true)
    private void provider__1269259092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1269259092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "provider()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSProvider;", cancellable = true)
    private void provider__204427947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-204427947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1727964206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1727964206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/PathMatcher;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFileSystem;", cancellable = true)
    private static void create_1303199334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303199334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPath(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", cancellable = true)
    private void getPath__1141251953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1141251953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPath(Ljava/lang/String;[Ljava/lang/String;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void getPath_2106971530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106971530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReadOnly()Z", cancellable = true)
    private void isReadOnly_886349730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886349730L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSeparator()Ljava/lang/String;", cancellable = true)
    private void getSeparator__1829245297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1829245297L))
            info.setReturnValue("v:LAQh0h\uCBE3\u551D\u88A3nn,VavY%]'\u84BB^\u9AA2H\"EuQsp1mhZF&Yf7S");
    }

    @Inject(at = @At("HEAD"), method = "createDirectories(Ljava/util/List;)V", cancellable = true)
    private static void createDirectories__1473817436(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1473817436L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "supportedFileAttributeViews()Ljava/util/Set;", cancellable = true)
    private void supportedFileAttributeViews_1011462557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011462557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRootDirectories()Ljava/lang/Iterable;", cancellable = true)
    private void getRootDirectories__1482107470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482107470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileStores()Ljava/lang/Iterable;", cancellable = true)
    private void getFileStores_78119843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(78119843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathMatcher(Ljava/lang/String;)Ljava/nio/file/PathMatcher;", cancellable = true)
    private void getPathMatcher_572686988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572686988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUserPrincipalLookupService()Ljava/nio/file/attribute/UserPrincipalLookupService;", cancellable = true)
    private void getUserPrincipalLookupService_1259270397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1259270397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newWatchService()Ljava/nio/file/WatchService;", cancellable = true)
    private void newWatchService__1360052166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1360052166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rootPath()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void rootPath__506370857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-506370857L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tmpDirectory()Ljava/nio/file/Path;", cancellable = true)
    private void tmpDirectory_629315851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629315851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backingFileSystem()Ljava/nio/file/FileSystem;", cancellable = true)
    private void backingFileSystem__2072193963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072193963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveFiles(Ljava/util/List;)V", cancellable = true)
    private static void moveFiles_1990219021(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1990219021L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "baseDirectory()Ljava/nio/file/Path;", cancellable = true)
    private void baseDirectory__741903727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-741903727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "collectMoveOperations(Ljava/nio/file/Path;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFileSystem$Moves;", cancellable = true)
    private void collectMoveOperations__1401149599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1401149599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveFilesWithRetry(Ljava/util/List;[Ljava/nio/file/CopyOption;)V", cancellable = true)
    private static void moveFilesWithRetry__898566062(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-898566062L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryRevertMoves(Ljava/util/List;[Ljava/nio/file/CopyOption;)Ljava/util/List;", cancellable = true)
    private static void tryRevertMoves__46776504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-46776504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hardLinkFiles(Ljava/util/List;)V", cancellable = true)
    private static void hardLinkFiles__1913808959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1913808959L))
            info.cancel();
    }


}
