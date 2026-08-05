package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.access.FileAccess.class)
public class FileAccess_1656144632Mixin {
        @Inject(at = @At("HEAD"), method = "get()Ljava/util/List;", cancellable = true)
    private void get_1705851261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705851261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__458430798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-458430798L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOnlyFile()Ljava/lang/AutoCloseable;", cancellable = true)
    private void getOnlyFile__586602162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-586602162L))
            info.setReturnValue(null);
    }


}
