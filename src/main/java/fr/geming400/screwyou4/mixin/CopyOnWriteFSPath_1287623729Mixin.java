package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.virtualfilesystem.CopyOnWriteFSPath.class)
public class CopyOnWriteFSPath_1287623729Mixin {
        @Inject(at = @At("HEAD"), method = "getName(I)Ljava/nio/file/Path;", cancellable = true)
    private void getName_2116932372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116932372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_378996964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378996964L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2058046757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2058046757L))
            info.setReturnValue("pqi_Wri\uCE19\u70C2\uD213\u15BE\u5A8C\u0C02f\u31BDF]R\u97FBc^=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1844975323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1844975323L))
            info.setReturnValue(359120494);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__604480206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-604480206L))
            info.setReturnValue(-252388809);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/nio/file/Path;)I", cancellable = true)
    private void compareTo_1209010485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1209010485L))
            info.setReturnValue(1039626322);
    }

    @Inject(at = @At("HEAD"), method = "startsWith(Ljava/nio/file/Path;)Z", cancellable = true)
    private void startsWith_914256495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(914256495L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "endsWith(Ljava/nio/file/Path;)Z", cancellable = true)
    private void endsWith__657662680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-657662680L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "register(Ljava/nio/file/WatchService;[Ljava/nio/file/WatchEvent$Kind;[Ljava/nio/file/WatchEvent$Modifier;)Ljava/nio/file/WatchKey;", cancellable = true)
    private void register_579641431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(579641431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAbsolute()Z", cancellable = true)
    private void isAbsolute__1678326330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1678326330L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", cancellable = true)
    private void resolve_1123481847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1123481847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Ljava/lang/String;)Ljava/nio/file/Path;", cancellable = true)
    private void resolve__1025825168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1025825168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Ljava/lang/String;[Ljava/lang/String;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void resolve__16452750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-16452750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Ljava/nio/file/Path;)Ljava/nio/file/Path;", cancellable = true)
    private void resolve_1021807611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1021807611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Ljava/nio/file/Path;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void resolve__1960312586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1960312586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Ljava/lang/String;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void resolve__1860861973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1860861973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParent()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void getParent__311482391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-311482391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParent()Ljava/nio/file/Path;", cancellable = true)
    private void getParent_1208341358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1208341358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRoot()Ljava/nio/file/Path;", cancellable = true)
    private void getRoot_525791590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525791590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toRealPath([Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;", cancellable = true)
    private void toRealPath__1386507568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1386507568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toRealPath([Ljava/nio/file/LinkOption;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void toRealPath__1980961845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980961845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileName()Ljava/nio/file/Path;", cancellable = true)
    private void getFileName__72694677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-72694677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileName()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void getFileName_1112297830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1112297830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileSystem()Ljava/nio/file/FileSystem;", cancellable = true)
    private void getFileSystem_1295583977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1295583977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileSystem()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFileSystem;", cancellable = true)
    private void getFileSystem_1623043601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1623043601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "normalize()Ljava/nio/file/Path;", cancellable = true)
    private void normalize__1941581861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1941581861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "normalize()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void normalize_622326998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(622326998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toAbsolutePath()Ljava/nio/file/Path;", cancellable = true)
    private void toAbsolutePath__1311602907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1311602907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toAbsolutePath()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void toAbsolutePath__970562272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-970562272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNameCount()I", cancellable = true)
    private void getNameCount__484631480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-484631480L))
            info.setReturnValue(-1503172264);
    }

    @Inject(at = @At("HEAD"), method = "relativize(Ljava/nio/file/Path;)Ljava/nio/file/Path;", cancellable = true)
    private void relativize__1208154742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1208154742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relativize(Ljava/nio/file/Path;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void relativize__696737787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-696737787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subpath(II)Ljava/nio/file/Path;", cancellable = true)
    private void subpath__1566897389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1566897389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toUri()Ljava/net/URI;", cancellable = true)
    private void toUri_1466053634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466053634L))
            info.setReturnValue(null);
    }


}
