package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.access.FileAccess.class)
public class FileAccess_1656144632Mixin {
        @Inject(at = @At("HEAD"), method = "get()Ljava/util/List;", cancellable = true)
    private void get__1012485849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1012485849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1694419370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1694419370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOnlyFile()Ljava/lang/AutoCloseable;", cancellable = true)
    private void getOnlyFile__1029187252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1029187252L))
            info.setReturnValue(null);
    }


}
