package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.DirectoryLock.class)
public class DirectoryLock_1869819894Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1908094632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1908094632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/nio/file/Path;)Lnet/minecraft/util/DirectoryLock;", cancellable = true)
    private static void create__2144249571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144249571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isLocked(Ljava/nio/file/Path;)Z", cancellable = true)
    private static void isLocked__817856509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-817856509L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isValid()Z", cancellable = true)
    private void isValid_1908098476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908098476L))
            info.setReturnValue(true);
    }


}
