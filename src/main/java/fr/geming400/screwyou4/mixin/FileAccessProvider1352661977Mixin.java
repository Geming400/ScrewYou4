package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.access.FileAccessProvider.class)
public class FileAccessProvider1352661977Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1390936716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1390936716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "freeze()V", cancellable = true)
    private void freeze_1390936716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1390936716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dataVersion()I", cancellable = true)
    private void dataVersion_1390924223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390924223L))
            info.setReturnValue(230537389);
    }

    @Inject(at = @At("HEAD"), method = "getFileAccess(Lnet/minecraft/util/filefix/access/FileResourceType;Lnet/minecraft/util/filefix/access/FileRelation;)Lnet/minecraft/util/filefix/access/FileAccess;", cancellable = true)
    private void getFileAccess_930582593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(930582593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseDirectory()Ljava/lang/ScopedValue;", cancellable = true)
    private void baseDirectory__1451743024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1451743024L))
            info.setReturnValue(null);
    }


}
