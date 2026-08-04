package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.linkfs.LinkFileSystem.class)
public class LinkFileSystem1682933611Mixin {
        @Inject(at = @At("HEAD"), method = "store()Ljava/nio/file/FileStore;", cancellable = true)
    private void store__1952082795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952082795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/server/packs/linkfs/LinkFileSystem$Builder;", cancellable = true)
    private static void builder_38167386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(38167386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOpen()Z", cancellable = true)
    private void isOpen_1721212194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1721212194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "provider()Ljava/nio/file/spi/FileSystemProvider;", cancellable = true)
    private void provider__810290289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-810290289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1721208350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1721208350L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPath(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", cancellable = true)
    private void getPath__2095120802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2095120802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReadOnly()Z", cancellable = true)
    private void isReadOnly_1721212194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1721212194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSeparator()Ljava/lang/String;", cancellable = true)
    private void getSeparator_547473140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(547473140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "supportedFileAttributeViews()Ljava/util/Set;", cancellable = true)
    private void supportedFileAttributeViews__146101875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-146101875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRootDirectories()Ljava/lang/Iterable;", cancellable = true)
    private void getRootDirectories__326816077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-326816077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileStores()Ljava/lang/Iterable;", cancellable = true)
    private void getFileStores__326816077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-326816077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathMatcher(Ljava/lang/String;)Ljava/nio/file/PathMatcher;", cancellable = true)
    private void getPathMatcher__986389225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-986389225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUserPrincipalLookupService()Ljava/nio/file/attribute/UserPrincipalLookupService;", cancellable = true)
    private void getUserPrincipalLookupService_1626277475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1626277475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newWatchService()Ljava/nio/file/WatchService;", cancellable = true)
    private void newWatchService__643582232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-643582232L))
            info.setReturnValue(null);
    }


}
