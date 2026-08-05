package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.linkfs.LinkFileSystem.class)
public class LinkFileSystem1682933611Mixin {
        @Inject(at = @At("HEAD"), method = "store()Ljava/nio/file/FileStore;", cancellable = true)
    private void store__1486851244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1486851244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/server/packs/linkfs/LinkFileSystem$Builder;", cancellable = true)
    private static void builder__2128140875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2128140875L))
            info.setReturnValue(new net.minecraft.server.packs.linkfs.LinkFileSystem.Builder());
    }

    @Inject(at = @At("HEAD"), method = "isOpen()Z", cancellable = true)
    private void isOpen_59709198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59709198L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "provider()Ljava/nio/file/spi/FileSystemProvider;", cancellable = true)
    private void provider_26934336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(26934336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__431641818(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-431641818L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPath(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", cancellable = true)
    private void getPath_154945443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(154945443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReadOnly()Z", cancellable = true)
    private void isReadOnly__2112295178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2112295178L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSeparator()Ljava/lang/String;", cancellable = true)
    private void getSeparator__532922909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532922909L))
            info.setReturnValue("u*z))(SS>#\u247F");
    }

    @Inject(at = @At("HEAD"), method = "supportedFileAttributeViews()Ljava/util/Set;", cancellable = true)
    private void supportedFileAttributeViews__1987182351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1987182351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRootDirectories()Ljava/lang/Iterable;", cancellable = true)
    private void getRootDirectories__185785082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-185785082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileStores()Ljava/lang/Iterable;", cancellable = true)
    private void getFileStores_1374442231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1374442231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathMatcher(Ljava/lang/String;)Ljava/nio/file/PathMatcher;", cancellable = true)
    private void getPathMatcher_1869009376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1869009376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUserPrincipalLookupService()Ljava/nio/file/attribute/UserPrincipalLookupService;", cancellable = true)
    private void getUserPrincipalLookupService__1739374511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739374511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newWatchService()Ljava/nio/file/WatchService;", cancellable = true)
    private void newWatchService__63729778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-63729778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rootPath()Lnet/minecraft/server/packs/linkfs/LinkFSPath;", cancellable = true)
    private void rootPath__2110104327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110104327L))
            info.setReturnValue(null);
    }


}
