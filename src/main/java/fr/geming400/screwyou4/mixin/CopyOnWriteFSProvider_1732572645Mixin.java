package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.virtualfilesystem.CopyOnWriteFSProvider.class)
public class CopyOnWriteFSProvider_1732572645Mixin {
        @Inject(at = @At("HEAD"), method = "isHidden(Ljava/nio/file/Path;)Z", cancellable = true)
    private void isHidden__955104006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-955104006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)V", cancellable = true)
    private void copy__521135234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-521135234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkAccess(Ljava/nio/file/Path;[Ljava/nio/file/AccessMode;)V", cancellable = true)
    private void checkAccess__2066526240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2066526240L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "delete(Ljava/nio/file/Path;)V", cancellable = true)
    private void delete__955106858(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-955106858L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getScheme()Ljava/lang/String;", cancellable = true)
    private void getScheme_597112173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597112173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPath(Ljava/net/URI;)Ljava/nio/file/Path;", cancellable = true)
    private void getPath_1494480736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1494480736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileSystem(Ljava/net/URI;)Ljava/nio/file/FileSystem;", cancellable = true)
    private void getFileSystem__1563437830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1563437830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileAttributeView(Ljava/nio/file/Path;Ljava/lang/Class;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;", cancellable = true)
    private void getFileAttributeView_1722928525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1722928525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readAttributes(Ljava/nio/file/Path;Ljava/lang/Class;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;", cancellable = true)
    private void readAttributes__1444267439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1444267439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readAttributes(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;", cancellable = true)
    private void readAttributes_1200277635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200277635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDirectory(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)V", cancellable = true)
    private void createDirectory_1626297696(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1626297696L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "newFileChannel(Ljava/nio/file/Path;Ljava/util/Set;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/channels/FileChannel;", cancellable = true)
    private void newFileChannel__1727180776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1727180776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newByteChannel(Ljava/nio/file/Path;Ljava/util/Set;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/channels/SeekableByteChannel;", cancellable = true)
    private void newByteChannel__1462388970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462388970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newDirectoryStream(Ljava/nio/file/Path;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;", cancellable = true)
    private void newDirectoryStream__360850758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-360850758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)V", cancellable = true)
    private void move__521134242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-521134242L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFileStore(Ljava/nio/file/Path;)Ljava/nio/file/FileStore;", cancellable = true)
    private void getFileStore__1137586323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1137586323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newFileSystem(Ljava/net/URI;Ljava/util/Map;)Ljava/nio/file/FileSystem;", cancellable = true)
    private void newFileSystem_592639523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592639523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSameFile(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z", cancellable = true)
    private void isSameFile__343664423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-343664423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAttribute(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)V", cancellable = true)
    private void setAttribute__21224014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-21224014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRealPath(Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void getRealPath__1230431677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1230431677L))
            info.setReturnValue(null);
    }


}
