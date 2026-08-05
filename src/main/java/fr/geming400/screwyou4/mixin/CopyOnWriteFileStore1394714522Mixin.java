package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.virtualfilesystem.CopyOnWriteFileStore.class)
public class CopyOnWriteFileStore1394714522Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_259254051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259254051L))
            info.setReturnValue("pb\u8895'*\"B\u6163Je/1!=Bo\u9509A|2si=_@ki=-rjWra\uC21A\u950BU\u37EB\"Z_m6k:;STh\uA1E1n\u65CDI!'ey");
    }

    @Inject(at = @At("HEAD"), method = "type()Ljava/lang/String;", cancellable = true)
    private void type_259254051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259254051L))
            info.setReturnValue("pb\u8895'*\"B\u6163Je/1!=Bo\u9509A|2si=_@ki=-rjWra\uC21A\u950BU\u37EB\"Z_m6k:;STh\uA1E1n\u65CDI!'ey");
    }

    @Inject(at = @At("HEAD"), method = "isReadOnly()Z", cancellable = true)
    private void isReadOnly_1432993105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432993105L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getTotalSpace()J", cancellable = true)
    private void getTotalSpace_1432977729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432977729L))
            info.setReturnValue(5766163394407212620L);
    }

    @Inject(at = @At("HEAD"), method = "getUsableSpace()J", cancellable = true)
    private void getUsableSpace_1432977729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432977729L))
            info.setReturnValue(5766163394407212620L);
    }

    @Inject(at = @At("HEAD"), method = "getUnallocatedSpace()J", cancellable = true)
    private void getUnallocatedSpace_1432977729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432977729L))
            info.setReturnValue(5766163394407212620L);
    }

    @Inject(at = @At("HEAD"), method = "supportsFileAttributeView(Ljava/lang/String;)Z", cancellable = true)
    private void supportsFileAttributeView__1747887781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747887781L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "supportsFileAttributeView(Ljava/lang/Class;)Z", cancellable = true)
    private void supportsFileAttributeView_1294542212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1294542212L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFileStoreAttributeView(Ljava/lang/Class;)Ljava/nio/file/attribute/FileStoreAttributeView;", cancellable = true)
    private void getFileStoreAttributeView_182766683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(182766683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttribute(Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void getAttribute_1307141739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1307141739L))
            info.setReturnValue(new java.lang.Object());
    }


}
