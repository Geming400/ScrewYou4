package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.access.FileAccessProvider.class)
public class FileAccessProvider1352661977Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__761913452(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-761913452L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "freeze()V", cancellable = true)
    private void freeze__878457259(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-878457259L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dataVersion()I", cancellable = true)
    private void dataVersion_845746353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(845746353L))
            info.setReturnValue(-2145273129);
    }

    @Inject(at = @At("HEAD"), method = "baseDirectory()Ljava/lang/ScopedValue;", cancellable = true)
    private void baseDirectory_989140148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(989140148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFileAccess(Lnet/minecraft/util/filefix/access/FileResourceType;Lnet/minecraft/util/filefix/access/FileRelation;)Lnet/minecraft/util/filefix/access/FileAccess;", cancellable = true)
    private void getFileAccess_1093858743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1093858743L))
            info.setReturnValue(null);
    }


}
