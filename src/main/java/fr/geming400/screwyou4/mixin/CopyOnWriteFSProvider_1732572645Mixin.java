package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.virtualfilesystem.CopyOnWriteFSProvider.class)
public class CopyOnWriteFSProvider_1732572645Mixin {
        @Inject(at = @At("HEAD"), method = "isHidden(Ljava/nio/file/Path;)Z", cancellable = true)
    private void isHidden_1472151558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1472151558L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "copy(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)V", cancellable = true)
    private void copy_2121817587(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2121817587L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkAccess(Ljava/nio/file/Path;[Ljava/nio/file/AccessMode;)V", cancellable = true)
    private void checkAccess_285147756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(285147756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "delete(Ljava/nio/file/Path;)V", cancellable = true)
    private void delete_1506138763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1506138763L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getScheme()Ljava/lang/String;", cancellable = true)
    private void getScheme_1095063496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095063496L))
            info.setReturnValue("F\u2D84 VCxD\u4FB49Ie\uCC2CGD;6# vQ<D\u6AA0b^f\uBE20VEqG\uA0011R\uBD3C.DMS^\u6C58L5?G\u85BCdhH6fs\"P2c_!7Pkq`f\u24B26}]Fb\u09F6<\u2C96y");
    }

    @Inject(at = @At("HEAD"), method = "getPath(Ljava/net/URI;)Ljava/nio/file/Path;", cancellable = true)
    private void getPath_318011323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(318011323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileSystem(Ljava/net/URI;)Ljava/nio/file/FileSystem;", cancellable = true)
    private void getFileSystem_1508406843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508406843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileAttributeView(Ljava/nio/file/Path;Ljava/lang/Class;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;", cancellable = true)
    private void getFileAttributeView_791231262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791231262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readAttributes(Ljava/nio/file/Path;Ljava/lang/Class;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;", cancellable = true)
    private void readAttributes__1482447260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482447260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readAttributes(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;", cancellable = true)
    private void readAttributes__1882590320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1882590320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDirectory(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)V", cancellable = true)
    private void createDirectory_1873837743(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1873837743L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "newFileChannel(Ljava/nio/file/Path;Ljava/util/Set;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/channels/FileChannel;", cancellable = true)
    private void newFileChannel__1302601217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1302601217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newByteChannel(Ljava/nio/file/Path;Ljava/util/Set;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/channels/SeekableByteChannel;", cancellable = true)
    private void newByteChannel_324555249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(324555249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newDirectoryStream(Ljava/nio/file/Path;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;", cancellable = true)
    private void newDirectoryStream__1024894131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1024894131L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)V", cancellable = true)
    private void move_622326319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(622326319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFileStore(Ljava/nio/file/Path;)Ljava/nio/file/FileStore;", cancellable = true)
    private void getFileStore_963721534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(963721534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newFileSystem(Ljava/net/URI;Ljava/util/Map;)Ljava/nio/file/FileSystem;", cancellable = true)
    private void newFileSystem__1770414408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1770414408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSameFile(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z", cancellable = true)
    private void isSameFile_740865549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(740865549L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setAttribute(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)V", cancellable = true)
    private void setAttribute__1655946228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1655946228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRealPath(Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void getRealPath_1158948380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1158948380L))
            info.setReturnValue(null);
    }


}
