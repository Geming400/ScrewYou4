package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.virtualfilesystem.CopyOnWriteFileStore.class)
public class CopyOnWriteFileStore1394714522Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__2090985618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090985618L))
            info.setReturnValue("A0uq$43[\uA235\u59B9sT%xe\u043D^EGs \uAD97`\u056BHC{94\u6261}&[M|n_2h\uAD17g4\uCDBB4");
    }

    @Inject(at = @At("HEAD"), method = "type()Ljava/lang/String;", cancellable = true)
    private void type__419303715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-419303715L))
            info.setReturnValue("2MHPK|'(\u42ABJ \u42BDMW\u4139}&\uFC29\u9DB8\uA9AFgum@P@@m;d{\u5321\u7B7Au_t4G<\"6>G(?h\uFED9{|`vn/L\u7954l\u6DC5B.DHK&U");
    }

    @Inject(at = @At("HEAD"), method = "isReadOnly()Z", cancellable = true)
    private void isReadOnly_1894453029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894453029L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTotalSpace()J", cancellable = true)
    private void getTotalSpace_1040222249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1040222249L))
            info.setReturnValue(-3207180394685806355L);
    }

    @Inject(at = @At("HEAD"), method = "getUsableSpace()J", cancellable = true)
    private void getUsableSpace__498084215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-498084215L))
            info.setReturnValue(3409569717966866045L);
    }

    @Inject(at = @At("HEAD"), method = "getUnallocatedSpace()J", cancellable = true)
    private void getUnallocatedSpace__2052190413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2052190413L))
            info.setReturnValue(-6738616706082420491L);
    }

    @Inject(at = @At("HEAD"), method = "supportsFileAttributeView(Ljava/lang/String;)Z", cancellable = true)
    private void supportsFileAttributeView_1321654042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1321654042L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "supportsFileAttributeView(Ljava/lang/Class;)Z", cancellable = true)
    private void supportsFileAttributeView_146633701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(146633701L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFileStoreAttributeView(Ljava/lang/Class;)Ljava/nio/file/attribute/FileStoreAttributeView;", cancellable = true)
    private void getFileStoreAttributeView__1304023543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1304023543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttribute(Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void getAttribute_1905140817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905140817L))
            info.setReturnValue(null);
    }


}
