package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.virtualfilesystem.CopyOnWriteFSPath.class)
public class CopyOnWriteFSPath_1287623729Mixin {
        @Inject(at = @At("HEAD"), method = "getName(I)Ljava/nio/file/Path;", cancellable = true)
    private void getName_753009397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(753009397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1621831805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1621831805L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_152163257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(152163257L))
            info.setReturnValue("蚬\"(c-Sab⢸티穋w88N{*.6:MRxY[9PHaUx_콁/^E[X3k*ᨏ*Y#K6iWr RBṄD\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1325885974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325885974L))
            info.setReturnValue(-1768702403);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__1621719182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1621719182L))
            info.setReturnValue(-33772663);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/nio/file/Path;)I", cancellable = true)
    private void compareTo__1400069259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1400069259L))
            info.setReturnValue(1380156552);
    }

    @Inject(at = @At("HEAD"), method = "startsWith(Ljava/nio/file/Path;)Z", cancellable = true)
    private void startsWith__1400052922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1400052922L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "endsWith(Ljava/nio/file/Path;)Z", cancellable = true)
    private void endsWith__1400052922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1400052922L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "register(Ljava/nio/file/WatchService;[Ljava/nio/file/WatchEvent$Kind;[Ljava/nio/file/WatchEvent$Modifier;)Ljava/nio/file/WatchKey;", cancellable = true)
    private void register__741943244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-741943244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAbsolute()Z", cancellable = true)
    private void isAbsolute_1325902311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325902311L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", cancellable = true)
    private void resolve_1804661603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1804661603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Ljava/lang/String;)Ljava/nio/file/Path;", cancellable = true)
    private void resolve_1917963140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1917963140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Ljava/lang/String;[Ljava/lang/String;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void resolve__1612579874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612579874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Ljava/nio/file/Path;)Ljava/nio/file/Path;", cancellable = true)
    private void resolve__381076465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381076465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Ljava/nio/file/Path;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void resolve__2075073782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2075073782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Ljava/lang/String;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void resolve_427284223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(427284223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParent()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void getParent__23540663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-23540663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParent()Ljava/nio/file/Path;", cancellable = true)
    private void getParent_153389006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153389006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRoot()Ljava/nio/file/Path;", cancellable = true)
    private void getRoot_153260046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153260046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toRealPath([Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;", cancellable = true)
    private void toRealPath_1933890062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933890062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toRealPath([Ljava/nio/file/LinkOption;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void toRealPath__652032503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-652032503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileName()Ljava/nio/file/Path;", cancellable = true)
    private void getFileName_153389006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153389006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileName()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void getFileName__23540663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-23540663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileSystem()Ljava/nio/file/FileSystem;", cancellable = true)
    private void getFileSystem__291531800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-291531800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileSystem()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFileSystem;", cancellable = true)
    private void getFileSystem_27756624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(27756624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "normalize()Ljava/nio/file/Path;", cancellable = true)
    private void normalize_153389006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153389006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "normalize()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void normalize__23540663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-23540663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toAbsolutePath()Ljava/nio/file/Path;", cancellable = true)
    private void toAbsolutePath_153389006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153389006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toAbsolutePath()Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void toAbsolutePath__23540663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-23540663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNameCount()I", cancellable = true)
    private void getNameCount_1325885974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325885974L))
            info.setReturnValue(-1768702403);
    }

    @Inject(at = @At("HEAD"), method = "relativize(Ljava/nio/file/Path;)Ljava/nio/file/Path;", cancellable = true)
    private void relativize__381076465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381076465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relativize(Ljava/nio/file/Path;)Lnet/minecraft/util/filefix/virtualfilesystem/CopyOnWriteFSPath;", cancellable = true)
    private void relativize__2075073782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2075073782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subpath(II)Ljava/nio/file/Path;", cancellable = true)
    private void subpath__2129597202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2129597202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toUri()Ljava/net/URI;", cancellable = true)
    private void toUri__1255160495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1255160495L))
            info.setReturnValue(null);
    }


}
